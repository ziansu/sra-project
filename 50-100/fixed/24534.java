public void onClick(android.view.View v) {
    if (((v.getId()) == (R.id.username_header)) || ((v.getId()) == (R.id.database_header))) {
        android.content.Intent intent = new android.content.Intent(this, org.vai.vari.bsiandroid.LoginActivity.class);
        startActivity(intent);
        mDrawerLayout.closeDrawer(mNavigationView);
    }
}