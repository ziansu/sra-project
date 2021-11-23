@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent next = new android.content.Intent(this, lifecounter.radek.washington.edu.quizdroidparti.ViewFramework.class);
    next.putExtra("selectedTopic", topicArray[position]);
    app.setCurrentTopic(topics.get(position));
    startActivity(next);
}