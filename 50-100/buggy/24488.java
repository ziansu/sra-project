@java.lang.Override
protected void onResume() {
    hideMainElements();
    isPaused = false;
    if (needToChangeFragment) {
        if ((selectedConversation.v) == null) {
            addToNavBar(edu.ucsd.neurores.MainActivity.PRIVATE_MENU_GROUP, selectedConversation);
        }else {
            selectedConversation.select();
        }
        changeFragment();
        needToChangeFragment = false;
    }else
        if ((currentFragment) != null) {
            updateNavDrawer();
        }
    
    connectSocket();
    super.onResume();
    hideSoftKeyboard();
}