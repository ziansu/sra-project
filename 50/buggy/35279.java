@java.lang.Override
public com.github.abdurahmanovart.notesrealm.adapter.NoteAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View row = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, true);
    return new com.github.abdurahmanovart.notesrealm.adapter.NoteAdapter.ViewHolder(row);
}