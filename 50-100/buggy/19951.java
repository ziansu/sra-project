@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    todomanager = terstall.jeroenterstall_pset5.TodoManager.getInstance();
    todomanager.readTodos(getApplicationContext());
    todolistfragment = ((terstall.jeroenterstall_pset5.TodoListFragment) (getSupportFragmentManager().findFragmentById(R.id.todolistfragment)));
    todomanagerfragment = ((terstall.jeroenterstall_pset5.TodoManagerFragment) (getSupportFragmentManager().findFragmentById(R.id.todomanagerfragment)));
    setActionBar();
}