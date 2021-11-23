@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if (result.equals("Group created.")) {
        thorleifz.wakeup.DownloadGroupsTask downloadGroupsTask = new thorleifz.wakeup.DownloadGroupsTask(accountName, getApplicationContext());
        downloadGroupsTask.execute();
    }else {
        createGroupProgressBar.setVisibility(View.GONE);
        groupPasswordInfo.setText("GroupsID occupied");
    }
}