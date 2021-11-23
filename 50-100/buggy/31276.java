private void callPolice() {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_CALL);
    callIntent.setData(android.net.Uri.parse(POLICE_PHONE_NUM));
    try {
        startActivity(intent);
    } catch (com.example.hazai.supported.android e) {
        android.widget.Toast.makeText(getApplicationContext(), "Error, activity not found", Toast.LENGTH_SHORT).show();
    }
}