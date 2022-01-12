public static void showLogin(android.app.Fragment fragment, int requestCode) {
    if (fragment != null) {
        android.content.Intent intent = new android.content.Intent(fragment.getContext(), com.airmap.airmapsdk.ui.activities.LoginActivity.class);
        fragment.startActivityForResult(intent, requestCode);
    }
}