protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.mWorkoutView)));
    mLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    mRecyclerView.setLayoutManager(mLayoutManager);
    mAdapter = new com.dyel.oysterprimrose.WorkoutListAdapter(mWorkoutList);
    com.dyel.oysterprimrose.WorkoutListAdapter mListAdapter = new com.dyel.oysterprimrose.WorkoutListAdapter(mWorkoutList);
    mRecyclerView.setAdapter(mListAdapter);
}