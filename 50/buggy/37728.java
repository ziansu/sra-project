@com.squareup.otto.Subscribe
public void onCreateCharacter(amagi82.modularcharactersheetcreator.events.CreateCharacterEvent event) {
    final android.support.v4.app.Fragment fragment = new amagi82.modularcharactersheetcreator.fragments.CharacterFragment();
    fm.beginTransaction().replace(R.id.container, fragment).addToBackStack("transaction").commit();
}