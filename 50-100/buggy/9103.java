@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int button) {
    if (button == (android.content.DialogInterface.BUTTON_POSITIVE)) {
        getContentResolver().delete(ExperimentsProvider.CONTENT_URI, experimentFilter, null);
        android.widget.Toast.makeText(this, R.string.deleted, Toast.LENGTH_SHORT).show();
        android.content.Intent intent = new android.content.Intent(this, com.scuddertechnologies.pheoc.MainMenu.class);
        startActivity(intent);
    }
}