public void heroSelect(android.view.View view) {
    if ((selectedHeroes) != null) {
        selectedHeroes[0] = null;
        selectedHeroes[1] = null;
        selectedHeroes[2] = null;
        selectedHeroes[3] = null;
        selectedHeroes[4] = null;
        hero1UltTime = 0;
        hero2UltTime = 0;
        hero3UltTime = 0;
        hero4UltTime = 0;
        hero5UltTime = 0;
    }
    android.content.Intent intent = new android.content.Intent(this, com.android_app.alien.dota2gameplaymechanicstimer.HeroPickerActivity.class);
    startActivity(intent);
}