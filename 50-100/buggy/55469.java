@java.lang.Override
public void onBindViewHolder(gitmad.bitter.ui.PostAdapter.ViewHolder viewHolder, int i) {
    viewHolder.postText.setText(posts[i].getText());
    viewHolder.userText.setText(posts[i].getUser().getName());
    viewHolder.downvoteText.setText(posts[i].getDownvotes());
}