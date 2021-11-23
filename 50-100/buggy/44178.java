@java.lang.Override
public void onClick(android.view.View v) {
    colleges.remove(i);
    notifyDataSetChanged();
    h.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.lang.String id = "" + position;
            com.example.setup.finalproject.DBQueries.deleteRow(fragment.db, id);
        }
    });
}