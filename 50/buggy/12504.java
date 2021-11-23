@java.lang.Override
protected void onPreExecute() {
    updateDisplay("Getting Closing Prices\n\n\n");
    if ((taskList.size()) == 0) {
        pb.setVisibility(View.VISIBLE);
    }
    taskList.add(this);
}