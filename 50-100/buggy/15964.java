protected boolean oneBackward() {
    try {
        if (!(resultset.isClosed())) {
            if (resultset.previous()) {
                if (resultset.isBeforeFirst())
                    resultset.first();
                
                java.lang.System.out.println(resultset.getRow());
                return true;
            }
        }else {
            updateConnection();
            oneBackward();
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}