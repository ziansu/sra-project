@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_queue);
    super.onCreate(savedInstanceState);
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.queue_recycler_view)));
    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    android.support.v7.widget.DefaultItemAnimator animator = new android.support.v7.widget.DefaultItemAnimator() {
        @java.lang.Override
        public boolean canReuseUpdatedViewHolder(@android.support.annotation.NonNull
        android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
            return true;
        }
    };
    recyclerView.setItemAnimator(animator);
    tutorial = findViewById(R.id.queue_tutorial);
    updateTutorial();
}