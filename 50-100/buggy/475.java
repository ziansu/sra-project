public void fillUserPanel(Model.User[] user_list) {
    UsersPanel.removeAll();
    for (Model.User u : user_list) {
        GUI.UserView uv = new GUI.UserView();
        uv.setUser(u);
    }
    UsersPanel.repaint();
    UsersPanel.revalidate();
}