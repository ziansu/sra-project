public void run() {
    if ((i) < 39) {
        i += 1;
        java.lang.String imgName = "logo" + (java.lang.Integer.toString(i));
        id = getResources().getIdentifier(imgName, "drawable", getPackageName());
        imageViewLogo.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(this, id));
        aniHandle.postDelayed(this, duration);
    }
}