public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (user != null) {
        android.widget.Toast.makeText(com.android.yardsale.helpers.YardSaleApplication.context, "Logged In!!!!!", Toast.LENGTH_LONG).show();
        getYardSales(false, false);
    }else {
        android.widget.Toast.makeText(com.android.yardsale.helpers.YardSaleApplication.context, "Login failed :(", Toast.LENGTH_LONG).show();
        android.util.Log.d("DEBUG", "SIGNUP FAILED", e);
    }
}