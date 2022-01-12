@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    this.contactSupplier = new de.fau.amos.virtualledger.android.views.contacts.ContactsSupplier(getActivity());
    this.contactSupplier.addDataListeningObject(this);
    adapter = new de.fau.amos.virtualledger.android.views.contacts.ContactsAdapter(getActivity(), R.id.contacts_list, contactSupplier.getAll());
    contactListView.setAdapter(adapter);
    this.adapter.sort(new de.fau.amos.virtualledger.android.views.contacts.ContactsComparator());
    this.contactSupplier.onResume();
}