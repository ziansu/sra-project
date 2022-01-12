public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position > 0) {
        android.content.Intent i = new android.content.Intent(getApplicationContext(), org.inftel.androidrsa.activities.ChatActivity.class);
        i.putExtra("destJid", listaPresences.get((position - 1)).getFrom());
        i.putExtra(AndroidRsaConstants.PASSPHRASE, org.inftel.androidrsa.activities.ContactsActivity.passPhrase);
        startActivity(i);
    }
}