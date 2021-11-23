public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    switch (pos) {
        case 0 :
            break;
        case 1 :
            com.facebook.login.LoginManager.getInstance().logOut();
            com.parse.ParseUser.logOut();
            android.content.Intent login_intent = new android.content.Intent(this, grouphub.travelshare.Login.class);
            startActivity(login_intent);
            finish();
            break;
    }
}