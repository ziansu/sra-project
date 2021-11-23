private void confirmButtonPress(android.view.View view) {
    if (!(service_and_storage.Service.getInstance().getCheersFriends().contains(friend))) {
        addFriend(friendName, friendNum);
        cheersText.setText("Friend Added! Press restart to add another friend!");
    }else {
        cheersText.setText("Friend already exists! Press restart to add a different friend");
    }
}