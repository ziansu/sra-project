public void enterProject(android.view.View v) {
    android.content.SharedPreferences sharedPref = this.getSharedPreferences("Projects", Context.MODE_PRIVATE);
    android.content.Intent i = new android.content.Intent(this, com.example.facebook.insighting.SelectInsightActivity.class);
    android.widget.TextView x = ((android.widget.TextView) (v.findViewById(R.id.project_name)));
    i.putExtra("project", sharedPref.getString(x.getText().toString(), ""));
    startActivity(i);
}