public java.lang.String execute() throws java.sql.SQLException {
    java.lang.String ret = ERROR;
    user_id = 0;
    if (session.containsKey("userId")) {
        user_id = ((int) (session.get("userId")));
        com.internousdev.outdoornow.dao.UserMyCartDeleteDAO dao = new com.internousdev.outdoornow.dao.UserMyCartDeleteDAO();
        boolean deleteFlg = dao.delete(java.lang.Integer.parseInt(item_id), user_id);
        if (deleteFlg) {
            ret = SUCCESS;
            java.lang.System.out.println("OK");
        }
    }
    return ret;
}