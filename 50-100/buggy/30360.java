private void setCommentsLayout(android.view.View v, int position) {
    android.widget.EditText content = ((android.widget.EditText) (v.findViewById(R.id.comments_list_content)));
    android.widget.TextView name = ((android.widget.TextView) (v.findViewById(R.id.comments_list_name)));
    com.kareem.newme.Model.Comment comment = news.getComments().get((position - 1));
    content.setText(comment.getContent());
    name.setText(comment.getUserName());
}