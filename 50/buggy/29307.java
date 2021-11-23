private void showAddAddressDialog(java.lang.String title, java.lang.String address) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.DialogFragment frag = com.coinblesk.client.addresses.EditAddressFragment.newInstance(title, address);
    frag.show(fm, "fragment_edit_address");
}