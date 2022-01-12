@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    createGroupProgressBar.setVisibility(View.GONE);
    if (result.equals("Group created.")) {
        thorleifz.wakeup.DownloadGroupsTask downloadGroupsTask = new thorleifz.wakeup.DownloadGroupsTask(accountName, getApplicationContext());
        downloadGroupsTask.execute();
    }else {
        groupPasswordInfo.setText("GroupsID occupied");
    }
}