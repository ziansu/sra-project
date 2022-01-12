private void initializeAdapter() {
    adapter = new com.example.heetel.todo.RVAdapter(tasks, this);
    recyclerView.setAdapter(adapter);
}