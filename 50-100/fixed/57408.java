private void selectDrawerItem(int id) {
    switch (id) {
        case R.id.sign_in :
            startActivityForResult(com.firebase.ui.auth.AuthUI.getInstance().createSignInIntentBuilder().setProviders(java.util.Arrays.asList(new com.firebase.ui.auth.AuthUI.IdpConfig.Builder(com.firebase.ui.auth.AuthUI.GOOGLE_PROVIDER).build())).setIsSmartLockEnabled(false).build(), com.abhiroj.goonj.activity.MainActivity.RC_SIGN_IN);
            break;
        case R.id.sign_out :
            signOut();
            break;
    }
    drawerLayout.closeDrawers();
}