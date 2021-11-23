@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    loading.dismiss();
    if (s.equalsIgnoreCase("success")) {
        android.content.Intent intent = new android.content.Intent(this, com.example.aa.electronicpatientscard.PatientsList.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Invalid user name or password", Toast.LENGTH_LONG).show();
    }
}