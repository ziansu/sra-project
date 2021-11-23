public static void openLink(android.app.Activity activity, android.net.Uri link) {
    try {
        android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_VIEW, link);
        activity.startActivity(i);
        android.widget.Toast.makeText(activity, activity.getString(R.string.cant_open, link.toString()), Toast.LENGTH_SHORT).show();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}