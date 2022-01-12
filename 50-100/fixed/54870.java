@java.lang.Override
public void onPostExecute(java.lang.String result) {
    if (!((result.equals("false")) || (result == null))) {
        android.widget.Toast.makeText(this, "帖子已创建", Toast.LENGTH_SHORT).show();
        bl.CampusBLService.inviteToAnswer(result, userList);
    }else
        android.widget.Toast.makeText(this, "帖子创建失败", Toast.LENGTH_SHORT).show();
    
    this.finish();
}