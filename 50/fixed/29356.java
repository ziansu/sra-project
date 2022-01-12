@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent callIntent = new android.content.Intent(android.content.Intent.ACTION_CALL);
    callIntent.setData(android.net.Uri.parse(("tel:+" + (property.value))));
    startActivity(callIntent);
}