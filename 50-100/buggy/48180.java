public void addNewPost(android.view.View view) {
    txtPostTitle = ((android.widget.EditText) (findViewById(R.id.postTitle)));
    txtPostDesc = ((android.widget.EditText) (findViewById(R.id.postDesc)));
    PostTitle = txtPostTitle.getText().toString();
    PostDesc = txtPostDesc.getText().toString();
    com.josh_davey.noticeboardapp.BackgroundTasks addPost = new com.josh_davey.noticeboardapp.BackgroundTasks(this, this);
    addPost.execute("addpost", user, null, PostTitle, PostDesc);
}