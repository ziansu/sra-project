@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    joinProgressBar.setVisibility(View.GONE);
    if (s.equals("Group joined!")) {
        thorleifz.wakeup.DownloadGroupsTask downloadGroupsTask = new thorleifz.wakeup.DownloadGroupsTask(accountName, getApplicationContext());
        downloadGroupsTask.execute();
    }else {
        joinInfo.setText("Wrong username or password");
    }
}