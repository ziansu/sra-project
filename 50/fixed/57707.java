@java.lang.Override
public adityagurjar.people.contactsListAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_row, parent, false);
    return new adityagurjar.people.contactsListAdapter.MyViewHolder(itemView);
}