private void initView() {
    resetRealm();
    realm = io.realm.Realm.getInstance(getRealmConfig());
    io.realm.RealmResults<io.mochadwi.todo_go.model.todo.TodoItem> toDoItems = realm.where(io.mochadwi.todo_go.model.todo.TodoItem.class).findAllSorted("id", Sort.ASCENDING);
    io.mochadwi.todo_go.todo.ToDoRealmAdapter toDoRealmAdapter = new io.mochadwi.todo_go.todo.ToDoRealmAdapter(this, toDoItems, realm, true, true);
    rvItems.setAdapter(toDoRealmAdapter);
    fab.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            buildAndShowInputDialog();
        }
    });
}