@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    todomanager = terstall.jeroenterstall_pset5.TodoManager.getInstance();
    todomanager.readTodos(getApplicationContext());
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    todolistfragment = ((terstall.jeroenterstall_pset5.TodoListFragment) (getSupportFragmentManager().findFragmentById(R.id.todolistfragment)));
    todomanagerfragment = ((terstall.jeroenterstall_pset5.TodoManagerFragment) (getSupportFragmentManager().findFragmentById(R.id.todomanagerfragment)));
    setActionBar();
}