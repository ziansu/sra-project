@java.lang.Override
public void onClick(android.view.View v) {
    user.setFirstName(editTextFirstName.toString());
    user.setLastName(editTextLastName.toString());
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), aut.com.autfriendfinder.ProfileSummaryActivity.class);
    intent.putExtra("user", user);
    startActivity(intent);
}