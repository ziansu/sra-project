public void showJobActivity(android.view.View view) {
    saveInfo();
    android.content.Intent intent = new android.content.Intent(this, dat255.chalmers.com.welcome.JobActivity.class);
    dat255.chalmers.com.welcome.GenderAndBirthActivity.jobActivityActivated = true;
    startActivity(intent);
}