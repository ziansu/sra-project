protected boolean oneBackward() {
    try {
        if (!(resultset.isClosed())) {
            if (resultset.previous()) {
                return true;
            }
            if (resultset.isBeforeFirst()) {
                resultset.first();
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