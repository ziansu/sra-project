public void onDrawerItemClick(android.view.View view) {
    java.lang.String itemText = ((android.widget.TextView) (view)).getText().toString();
    if (itemText.equals(getString(R.string.drawer_item_sign_out))) {
        progressDialog.show();
        accountHandler.signOut();
    }
    if (itemText.equals(getString(R.string.drawer_item_settings))) {
    }
}