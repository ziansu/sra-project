@java.lang.Override
public java.lang.String doInBackground(java.lang.String... params) {
    bl.CampusBLService.refreshLatestPosts();
    return "";
}