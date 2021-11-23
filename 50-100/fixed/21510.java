@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (!(dataSnapshot.hasChild(com.stuart.hackatonproject.util.FirebaseUtils.getCurrentUniqueUserId()))) {
        com.stuart.hackatonproject.model.UserDB user = new com.stuart.hackatonproject.model.UserDB();
        user.setEmail(com.stuart.hackatonproject.helper.LoginHelper.getAuth().getCurrentUser().getEmail());
        user.setName(com.stuart.hackatonproject.helper.LoginHelper.getAuth().getCurrentUser().getDisplayName());
        user.save();
    }
    onSuccessLoginGoogle();
}