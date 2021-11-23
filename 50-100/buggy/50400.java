private boolean isShipped(java.lang.String orderNum) {
    try {
        pstmt = conn.prepareStatement("SELECT * FROM orderlist WHERE orderNum=?");
        pstmt.setString(1, orderNum);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            if (rs.getString("status").equals("已出貨"))
                return true;
            
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return false;
}