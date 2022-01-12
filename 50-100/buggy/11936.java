public void run() {
    movePotion = false;
    cauldron.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.chemistryGameCorrect));
    cauldron.setText("Correct");
    movePotion = false;
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            movePotion = false;
            cauldron.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.chemistryGameText));
            currQuestion += 1;
            movePotion = true;
            setUp();
        }
    }, 800);
}