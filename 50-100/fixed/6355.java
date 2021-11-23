@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    realm.beginTransaction();
    service.setAddress(((at.oneway.bene.dollo.adapter.AutoCompleteAddressAdapter) (avAddress.getAdapter())).filteredAddresses.get(position));
    avAddress.setText(service.getAddress().getDescription());
    calculateDistanceAndTime();
    realm.commitTransaction();
}