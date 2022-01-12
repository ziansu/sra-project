private void displayContactData() {
    com.tmholen.thecrazynewsmsapp.DataExtractor dataExtractor = new com.tmholen.thecrazynewsmsapp.DataExtractor(getContentResolver());
    dataExtractor.obtainContactInformation();
    android.widget.ListView contactList = ((android.widget.ListView) (findViewById(R.id.contactListView)));
    com.tmholen.thecrazynewsmsapp.ContactArrayAdapter contactArrayAdapter = new com.tmholen.thecrazynewsmsapp.ContactArrayAdapter(this, dataExtractor.getContacts());
    contactList.setAdapter(contactArrayAdapter);
}