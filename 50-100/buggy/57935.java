@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("debug", ((((contactData.FirstNane) + " ") + (contactData.LastName)) + " phone"));
    android.content.Intent phoneIntent = new android.content.Intent(android.content.Intent.ACTION_DIAL);
    phoneIntent.setData(android.net.Uri.parse(("tel:" + (contactData.PhoneNumber))));
    v.getContext().startActivity(android.content.Intent.createChooser(phoneIntent, "Call..."));
}