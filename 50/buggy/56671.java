public void goToMain(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, project.equationinvasion.MainActivity.class);
    startActivity(intent);
    noise.stopMusic();
    noise.close();
    finish();
}