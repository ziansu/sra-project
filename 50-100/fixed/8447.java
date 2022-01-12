@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String subreddit = viewHolder.nameInput.getText().toString();
    if (subreddit.equals("")) {
        android.widget.Toast.makeText(this, "Please enter a subreddit name", Toast.LENGTH_SHORT).show();
        return ;
    }
    performAdd(subreddit);
    viewHolder.nameInput.setText("");
}