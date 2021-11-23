private void initializeAdapter() {
    com.example.heetel.todo.RVAdapter adapter = new com.example.heetel.todo.RVAdapter(tasks, this);
    recyclerView.setAdapter(adapter);
}