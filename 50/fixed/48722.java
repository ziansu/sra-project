public static void setUser(model.User aUser) {
    if (aUser == null) {
        fxapp.FXApplication._user = null;
    }else {
        fxapp.FXApplication._user = new model.User(aUser);
    }
}