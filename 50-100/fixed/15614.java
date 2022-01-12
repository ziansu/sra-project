void addItems(android.location.Address address) {
    if (address == null)
        return ;
    
    java.lang.String currentTimeString = java.text.DateFormat.getTimeInstance().format(new java.util.Date());
    mAdapter.add(((currentTimeString + " - ") + (address.getAddressLine(0))));
}