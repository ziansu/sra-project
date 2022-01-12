@java.lang.Override
public ru.mail.tp.callbackpal.contacts.ContactsAdapter.ContactViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(mContext).inflate(R.layout.view_single_contact, null);
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        view.setBackgroundResource(R.drawable.ripple);
    }else {
        view.setBackgroundResource(R.drawable.contact_background);
    }
    ru.mail.tp.callbackpal.contacts.ContactsAdapter.ContactViewHolder contactViewHolder = new ru.mail.tp.callbackpal.contacts.ContactsAdapter.ContactViewHolder(view);
    return contactViewHolder;
}