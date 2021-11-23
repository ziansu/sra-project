@java.lang.Override
public void onClick(android.view.View v) {
    user.setFirstName(editTextFirstName.getText().toString().trim());
    user.setLastName(editTextLastName.getText().toString().trim());
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), aut.com.autfriendfinder.ProfileSummaryActivity.class);
    intent.putExtra("user", user);
    startActivity(intent);
}