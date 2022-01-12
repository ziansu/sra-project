public java.util.List<java.lang.String> getAllUserIds() {
    java.util.ArrayList<calendar.user.User> users;
    try {
        users = dao.getAllUsers();
    } catch (java.lang.Exception expt) {
        java.lang.System.err.println("Could not retrieve users.");
        expt.printStackTrace();
        return null;
    }
    java.util.List<java.lang.String> ids = new java.util.ArrayList<>();
    for (calendar.user.User user : users) {
        ids.add(user.getId());
    }
    return ids;
}