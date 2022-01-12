public boolean addNewUser(model.User theUser) {
    boolean hasBeenAdded = false;
    boolean alreadyExists = false;
    if (theUser != null) {
        for (int i = 0; i < (myUserList.size()); i++) {
            final model.User currUser = myUserList.get(i);
            alreadyExists = currUser.getEmail().equals(theUser.getEmail());
        }
        if (!alreadyExists) {
            myUserList.add(theUser);
            hasBeenAdded = true;
        }
    }
    return hasBeenAdded;
}