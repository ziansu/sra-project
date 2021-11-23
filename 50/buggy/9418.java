@java.lang.Override
public java.lang.String doInBackground(java.lang.String... params) {
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.String userId = params[0];
    bl.CampusBLService.refreshHottestPosts();
    return "";
}