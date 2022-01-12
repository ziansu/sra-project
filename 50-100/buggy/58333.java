@java.lang.Override
public com.asc_ii.bangnote.bangnote.NoteItemAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if ((mContext) == null) {
        mContext = parent.getContext();
    }
    android.view.View view = android.view.LayoutInflater.from(mContext).inflate(R.layout.note_item, parent, false);
    final com.asc_ii.bangnote.bangnote.NoteItemAdapter.ViewHolder holder = new com.asc_ii.bangnote.bangnote.NoteItemAdapter.ViewHolder(view);
    int position = holder.getAdapterPosition();
    return new com.asc_ii.bangnote.bangnote.NoteItemAdapter.ViewHolder(view);
}