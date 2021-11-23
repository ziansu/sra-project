@java.lang.Override
public void onClick(android.view.View v) {
    character_name.setText(getCharacter().getName());
    allowNameEdit(false);
    updateViews();
}