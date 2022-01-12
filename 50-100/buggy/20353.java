@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result.equals("cool")) {
        adapter = new com.example.hunter.planstart.CustomAdapter.ListRentersAdapters(getApplicationContext(), R.layout.listrentersview, value_array);
        BuyRent.setAdapter(adapter);
        android.widget.Toast.makeText(getApplicationContext(), "Cool", Toast.LENGTH_LONG).show();
    }
    if (result.equals("Not Connected or Server Down or No Signal")) {
        android.widget.Toast.makeText(getApplicationContext(), "Not Connected or Server Down or No Signal", Toast.LENGTH_LONG).show();
    }
}