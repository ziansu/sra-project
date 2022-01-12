@java.lang.Override
protected void onResume() {
    super.onResume();
    android.support.design.widget.FloatingActionButton fab = findViewById(R.id.add_task);
    fab.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.app.Fragment fragmentToAddTask = new com.example.hasmik_n.todolist.fragments.FragmentAddTask();
            android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragmentToAddTask);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    });
}