@java.lang.Override
protected void onPostExecute(java.lang.Boolean b) {
    android.widget.TextView Status = ((android.widget.TextView) (findViewById(R.id.Status)));
    if (b) {
        android.widget.Toast.makeText(this, "Registered", Toast.LENGTH_SHORT).show();
        android.content.Intent i = new android.content.Intent(getApplicationContext(), de.blogsiteloremipsum.gamingbets.activity.LoginActivity.class);
        startActivity(i);
    }else {
        Status.setText("Registration unsuccessful");
        Status.setVisibility(View.VISIBLE);
    }
}