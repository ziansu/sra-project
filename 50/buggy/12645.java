@java.lang.Override
public void onClick(android.view.View v) {
    mUser = com.pratilipi.mobile.android.homescreen.profile.ProfileUtil.getLoggedInUser(activity);
    if ((mUser) != null) {
        if (isAddedToLibrary)
            removeFromLibraryRequest();
        else
            addToLibraryRequest();
        
    }else {
        startLoginActivity();
    }
}