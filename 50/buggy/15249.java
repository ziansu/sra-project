@java.lang.Override
public java.lang.String doInBackground(java.lang.String... params) {
    java.lang.String userId = params[0];
    bl.CampusBLService.refreshLatestPosts();
    return "";
}