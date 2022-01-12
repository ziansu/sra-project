public void done(java.util.List<com.parse.ParseUser> user, materialtest.theartistandtheengineer.co.materialtest.ParseException e) {
    if (e == null) {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), materialtest.theartistandtheengineer.co.materialtest.MessagingActivity.class);
        intent.putExtra("RECIPIENT_ID", user.get(0).getObjectId());
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Error finding that user", Toast.LENGTH_SHORT).show();
    }
}