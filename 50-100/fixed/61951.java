@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_edit_task);
    mTaskTitle = ((android.widget.EditText) (findViewById(R.id.tvEditTaskTitle)));
    mEditButton = ((android.widget.Button) (findViewById(R.id.btEditTaskComplete)));
    taskIndex = getIntent().getIntExtra("currentItemIndex", (-1));
    java.lang.String taskTitle = getIntent().getStringExtra("currentItemData");
    mTaskTitle.append(getIntent().getStringExtra("currentItemData"));
}