@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    db = new com.mad.achatz.fa_todo.TodoDbAdapter(getActivity());
    todoList = new java.util.ArrayList<>();
    webAccess = new com.mad.achatz.fa_todo.TodoWebAccess(this);
    com.mad.achatz.fa_todo.TodoListAdapter listAdapter = new com.mad.achatz.fa_todo.TodoListAdapter(getContext(), todoList);
    listAdapter.setToDoListClickListener(this);
    setListAdapter(listAdapter);
    android.view.View view = inflater.inflate(R.layout.todo_list_fragment, container, false);
    progressDialog = new android.app.ProgressDialog(getContext());
    return view;
}