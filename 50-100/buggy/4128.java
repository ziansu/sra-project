@java.lang.Override
public void onClick(android.view.View view) {
    websearchholder.onClick(view);
    android.net.Uri webpage = android.net.Uri.parse(linkurl);
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, webpage);
    if ((intent.resolveActivity(currContext.getPackageManager())) != null) {
        currContext.startActivity(intent);
    }
}