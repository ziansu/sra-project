public boolean userIsExist(int id) {
    java.util.List<com.jamejam.bot.model.UserModel> userList = null;
    try {
        userList = dao.queryForEq("teleId", id);
    } catch (java.lang.Exception e) {
        java.lang.System.out.print(e.getMessage());
    }
    assert userList != null;
    return (userList.size()) > 0;
}