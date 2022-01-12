@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String name;
    java.lang.String ID;
    ID = idSelect.getSelectedItem().toString();
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putString("board_ID", ID);
    editor.apply();
    android.content.Intent intent = new android.content.Intent(this, com.example.tenny.uitest.Login.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
}