@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new_task);
    if ((findViewById(R.id.activity_new_task)) != null) {
        if (savedInstanceState != null) {
            return ;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.activity_new_task, new com.example.be.tasktracker.ChooseProject()).commit();
    }
}