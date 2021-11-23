public void run() {
    movePotion = false;
    cauldron.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.chemistryGameText));
    currQuestion += 1;
    movePotion = true;
    setUp();
}