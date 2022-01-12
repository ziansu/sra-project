@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mShouldResolve = false;
    this.person = Plus.PeopleApi.getCurrentPerson(mGoogleApiClient);
    com.andela.bark.models.User user = com.andela.bark.models.User.createGoogleUser(person);
    com.andela.bark.GKprManger kprManger = new com.andela.bark.GKprManger(user);
    if (kprManger.isAuthenticated) {
        android.widget.Toast.makeText(myActivity, "signed-in ", Toast.LENGTH_SHORT).show();
        android.content.Intent i = new android.content.Intent(myActivity, com.andela.bark.FragmentHostActivity.class);
        myActivity.startActivity(i);
    }
}