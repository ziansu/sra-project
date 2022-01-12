@java.lang.Override
public void onClick(android.view.View v) {
    final java.lang.String remove = colleges.get(position);
    colleges.remove(i);
    notifyDataSetChanged();
    h.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.example.setup.finalproject.DBQueries.deleteRow(fragment.db, remove);
        }
    });
}