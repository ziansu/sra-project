@com.squareup.otto.Subscribe
public void onCreateCharacter(amagi82.modularcharactersheetcreator.events.CreateCharacterEvent event) {
    fm.beginTransaction().replace(R.id.container, new amagi82.modularcharactersheetcreator.fragments.CharacterFragment()).addToBackStack(null).commit();
}