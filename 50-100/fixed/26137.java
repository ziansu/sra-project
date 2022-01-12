private void showLogin(java.util.ArrayList<java.lang.String> users) throws java.sql.SQLException {
    java.lang.String[] result = io.github.jon_bassi.view.WindowHandler.displayLoginPane(users);
    int res = java.lang.Integer.parseInt(result[0]);
    io.github.jon_bassi.Main.user = result[1].toLowerCase();
    if ((io.github.jon_bassi.Main.user.equals("")) || (res == 2)) {
        java.lang.System.exit(0);
    }
    return ;
}