public void ProfileSetup(android.view.View view) {
    checkUser(this);
    android.content.Intent intent = new android.content.Intent(this, itsjustaaron.food.ProfileSetup.class);
    startActivity(intent);
}