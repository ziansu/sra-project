@java.lang.Override
protected void onPreExecute() {
    if ((taskList.size()) == 0) {
        pb.setVisibility(View.VISIBLE);
    }
    taskList.add(this);
}