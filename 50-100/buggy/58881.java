@java.lang.Override
public void onClick(android.view.View v) {
    if ((((farmer.getMobileNumber()) != null) && (!(farmer.getMobileNumber().isEmpty()))) && (!(farmer.getMobileNumber().trim().equalsIgnoreCase("-")))) {
        android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_DIAL);
        intent.setData(android.net.Uri.parse(("tel:" + (farmer.getMobileNumber()))));
        startActivity(intent);
    }
}