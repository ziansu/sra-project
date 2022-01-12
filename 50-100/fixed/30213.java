@java.lang.Override
public void onClick(android.view.View v) {
    contactEmailText.setEnabled(false);
    java.lang.String emailSubject = ("Re: " + (event.getName())) + " - (Sent from AHA Android App)";
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    intent.setType("plain/text");
    intent.putExtra(Intent.EXTRA_EMAIL, new java.lang.String[]{ event.getContactEmail() });
    intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
    startActivity(intent);
}