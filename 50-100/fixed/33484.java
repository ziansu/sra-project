@java.lang.Override
public void onClick(android.view.View v) {
    if ((number != null) && (!(number.isEmpty()))) {
        android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_DIAL);
        intent.setData(android.net.Uri.parse(("tel:" + number)));
        startActivity(intent);
    }
}