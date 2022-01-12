public void run() {
    cauldron.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.chemistryGameCorrect));
    cauldron.setText("Correct");
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            cauldron.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.chemistryGameText));
            currQuestion += 1;
            movePotion = true;
            setUp();
        }
    }, 800);
}