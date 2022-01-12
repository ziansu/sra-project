private void getMessageDetail(final com.google.firebase.database.DataSnapshot dataSnapshot, final java.lang.String action) {
    com.firebasechatdemo.support.firebase.database.model.UserModel conversationModel = dataSnapshot.getValue(com.firebasechatdemo.support.firebase.database.model.UserModel.class);
    final com.firebasechatdemo.ui.model.UserListModel userListModel = new com.firebasechatdemo.ui.model.UserListModel();
    userListModel.userID = dataSnapshot.getKey();
    userListModel.title = conversationModel.name;
    userListModel.image = conversationModel.profilePic;
    userListModel.subtitle = conversationModel.email;
    if (action.equals(Constants.Other.INSERT))
        userListAdapter.addItem(userListModel);
    else
        if (action.equals(Constants.Other.REPLACE))
            userListAdapter.replaceItemWithKey(userListModel);
        
    
}