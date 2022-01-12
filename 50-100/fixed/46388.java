@java.lang.Override
protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    android.content.Intent intent = new android.content.Intent(this, com.example.s9942162b.homework3.HomeworkDetailActivity.class);
    intent.putExtra(HomeworkDetailActivity.HOMEWORK_PARCEL, mHomeworks.get(position));
    startActivity(intent);
}