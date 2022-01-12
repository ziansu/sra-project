private void initialize() {
    com.smart_to_do.uladzislau.smarttodo.MainDate mainDate = new com.smart_to_do.uladzislau.smarttodo.MainDate(findViewById(R.id.mainDateText));
    mainDate.initialize();
    com.smart_to_do.uladzislau.smarttodo.MainProgressBar mainProgressBar = new com.smart_to_do.uladzislau.smarttodo.MainProgressBar();
    this.userTaskManager = new com.smart_to_do.uladzislau.smarttodo.user_task.UserTaskManager();
    this.userTaskAdapater = new com.smart_to_do.uladzislau.smarttodo.user_task.UserTaskAdapater(this.userTaskManager, this);
    lv = ((android.widget.ListView) (findViewById(R.id.main_list_view)));
    lv.setAdapter(userTaskAdapater);
}