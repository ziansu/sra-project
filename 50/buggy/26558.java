@java.lang.Override
public void onClick(android.view.View v) {
    getCharacter().setName(character_name.getText().toString());
    allowNameEdit(false);
    updateViews();
    ((com.oakonell.dndcharacter.AbstractBaseActivity) (getActivity())).populateRecentCharacters();
}