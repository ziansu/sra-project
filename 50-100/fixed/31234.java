@java.lang.Override
public void onBindViewHolder(com.rcl.excalibur.adapters.ContactAdapter.ContactViewHolder holder, int position) {
    final com.rcl.excalibur.model.ContactModel contactModel = contacts.get(position);
    holder.nameTextView.setText(contactModel.getName());
    holder.emailTextView.setText(contactModel.getEmail());
    holder.observerRef = new java.lang.ref.WeakReference(observer);
}