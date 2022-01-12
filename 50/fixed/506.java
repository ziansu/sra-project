@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.soomla.profile.SoomlaProfile.getInstance().logout(mProvider);
    } catch (com.soomla.profile.exceptions.ProviderNotFoundException e) {
        e.printStackTrace();
    }
    updateUIOnLogout();
}