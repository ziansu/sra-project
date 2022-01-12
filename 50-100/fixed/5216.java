protected void initStudentLessonHistoryList() {
    recList = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.studentLessonHistoryList)));
    adapter = new com.example.shoomka.ejournal.adapter.RecyclerAdapter(this);
    llm = new android.support.v7.widget.LinearLayoutManager(this);
    llm.setOrientation(LinearLayoutManager.VERTICAL);
    recList.setAdapter(adapter);
    recList.setLayoutManager(llm);
}