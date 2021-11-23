@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    facebookUser = GetFacebookUser();
    setContentView(R.layout.main);
    android.widget.Button button_organise = ((android.widget.Button) (findViewById(R.id.organise_button)));
    button_organise.setOnClickListener(this);
    android.widget.Button button_invites = ((android.widget.Button) (findViewById(R.id.invites_button)));
    button_invites.setOnClickListener(this);
    dimappers.android.pub.AppUser user = new dimappers.android.pub.AppUser(facebookId);
}