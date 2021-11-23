public void loadAddReview() {
    if (prefs.getBoolean(Constants.IS_LOGGED_IN, true)) {
        android.content.Intent intent = new android.content.Intent(this, com.syntaxplayground.foodtruckr.activities.AddReviewActivity.class);
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.syntaxplayground.foodtruckr.activities.LoginActivity.class);
        android.widget.Toast.makeText(getBaseContext(), "Please login to leave a review", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}