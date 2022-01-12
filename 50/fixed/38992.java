public void addTask(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, iprog.group7.agendabuilder.android.AddTaskActivity.class);
    intent.putExtra(iprog.group7.agendabuilder.android.MainActivity.SOURCE, "new");
    startActivity(intent);
    finish();
}