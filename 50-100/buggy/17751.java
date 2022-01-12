@java.lang.Override
public void onClick(android.view.View view) {
    if ((post.getLinkUrl()) != null) {
        android.content.Intent browser = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(post.getLinkUrl()));
        getContext().startActivity(browser);
    }
}