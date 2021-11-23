@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.bLogout :
            userLocalStore.clearUserData();
            userLocalStore.setUserLoggedIn(false);
            android.content.Intent logoutIntent = new android.content.Intent(this, com.example.elazaoui.projet.Login.class);
            startActivity(logoutIntent);
            break;
        case R.id.bShare :
            android.content.Intent shareIntent = new android.content.Intent(this, com.example.elazaoui.projet.Share.class);
            startActivity(shareIntent);
            break;
        case R.id.bSearch :
            android.content.Intent searchIntent = new android.content.Intent(this, com.example.elazaoui.projet.Search.class);
            startActivity(searchIntent);
            break;
    }
}