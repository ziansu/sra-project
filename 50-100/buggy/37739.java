@java.lang.Override
public void done(com.parse.ParseUser object, com.parse.ParseException e) {
    if (e == null) {
        com.clothapp.profile.utils.ProfileUtils.user = object;
        com.clothapp.profile.utils.ProfileUtils.updateListItem(0, com.clothapp.profile.utils.ProfileUtils.user.get("name").toString());
        com.clothapp.profile.utils.ProfileUtils.updateListItem(3, com.clothapp.profile.utils.ProfileUtils.user.getEmail());
    }else {
        e.printStackTrace();
    }
}