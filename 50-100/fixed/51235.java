@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if (s.equals("Login successful")) {
        createLocalUser();
        thorleifz.wakeup.DownloadGroupsTask downloadGroupsTask = new thorleifz.wakeup.DownloadGroupsTask(accountName, getApplicationContext());
        downloadGroupsTask.execute();
    }else {
        loginProgressBar.setVisibility(View.GONE);
        loginInfo.setText("Wrong username or password");
    }
}