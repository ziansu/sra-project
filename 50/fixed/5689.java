@java.lang.Override
public io.mochadwi.todo_go.todo.ToDoRealmAdapter.ViewHolder onCreateRealmViewHolder(android.view.ViewGroup viewGroup, int viewType) {
    android.view.View v = inflater.inflate(R.layout.to_do_item_view, viewGroup, false);
    io.mochadwi.todo_go.todo.ToDoRealmAdapter.ViewHolder vh = new io.mochadwi.todo_go.todo.ToDoRealmAdapter.ViewHolder(v);
    return vh;
}