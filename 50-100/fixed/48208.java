@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (!(result.equals(""))) {
        android.widget.Toast.makeText(getApplicationContext(), ("Welcome " + username), Toast.LENGTH_SHORT).show();
        android.content.Intent profile = new android.content.Intent(getApplicationContext(), edu.gatech.rattracker.ProfileActivity.class);
        startActivity(profile);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
    }
}