void addItems(android.location.Address address) {
    if (address == null)
        return ;
    
    java.lang.String currentTimeString = java.text.DateFormat.getTimeInstance().format(new java.util.Date());
    mListItems.add(0, ((currentTimeString + " - ") + (address.getAddressLine(0))));
    mAdapter.notifyDataSetChanged();
    mAdapter.add(((currentTimeString + " - ") + (address.getAddressLine(0))));
}