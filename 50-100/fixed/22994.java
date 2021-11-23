private boolean userNotTaggedYet(java.lang.String userName) {
    boolean userFound = true;
    if (!(instaTagList.isEmpty())) {
        for (android.view.View user : instaTagList) {
            if (((android.widget.TextView) (user.findViewById(R.id.tag_text_view))).getText().toString().equals(userName)) {
                userFound = false;
                break;
            }
        }
    }else {
        userFound = true;
    }
    return userFound;
}