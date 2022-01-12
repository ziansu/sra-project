@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.LayoutInflater layoutInflater = getLayoutInflater();
    android.view.View viewRow = layoutInflater.inflate(this.resources, null);
    android.widget.TextView textView = ((android.widget.TextView) (viewRow.findViewById(R.id.textView_contact_item)));
    final com.example.trannh08.ad005database_sqlite.classes.Contact contact = this.contacts.get(position);
    textView.setText(contact.Name);
    return viewRow;
}