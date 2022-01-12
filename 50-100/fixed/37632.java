@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    int position = viewHolder.getAdapterPosition();
    android.support.v7.widget.RecyclerView.ViewHolder view = rvNote.findViewHolderForLayoutPosition(position);
    android.widget.TextView a = ((android.widget.TextView) (view.itemView.findViewById(R.id.tv_id)));
    com.example.patrick.outline.DatabaseHelper dbHelper = new com.example.patrick.outline.DatabaseHelper(getBaseContext());
    dbHelper.deleteNote(java.lang.Integer.parseInt(a.getText().toString()));
    noteAdapter.notifyItemRemoved(java.lang.Integer.parseInt(a.getText().toString()));
}