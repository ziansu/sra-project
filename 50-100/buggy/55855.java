public void addUser(java.lang.String userName, java.util.ArrayList<javafx.scene.image.Image> badges) {
    if (badges == null)
        addUser(userName);
    
    if ((indexOfUsersHBox(userName)) != null) {
        addBadgesToUser(userName, badges);
        return ;
    }
    addUser(userName);
    addBadgesToUser(userName, badges);
}