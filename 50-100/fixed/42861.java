@java.lang.Override
void pickRandomWords() {
    if ((myArrayAdapter) == null) {
        myArrayAdapter = new de.android.learngermanwithnavigationdrawer.adapter.MyArrayAdapter(this, allQuestionList);
    }
    listView.setAdapter(myArrayAdapter);
    listView.setSelector(R.drawable.list_selector);
    listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            questionTextView.setText(dictionary.get(allQuestionList.get(position)));
        }
    });
}