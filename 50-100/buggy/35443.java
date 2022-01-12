private void prepareTaskData(java.lang.String title, java.lang.String description, java.lang.String time) {
    task = new com.example.hp.intimer.recycleviewsetter.Task(title, description, time);
    com.example.hp.intimer.MainActivity.taskList.add(task);
    this.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.example.hp.intimer.MainActivity.tAdapter.notifyItemChanged(((com.example.hp.intimer.MainActivity.taskList.size()) - 1));
        }
    });
}