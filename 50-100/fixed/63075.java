public void run() {
    try {
        java.lang.Thread.sleep(((1500 / 2) - 250));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            toAdd.setImageDrawable(initialCur);
            if (isAllowedToPressLocal) {
                toAdd.setOnClickListener(edu.gettysburg.pokersquares.MainActivity.this);
            }
            if (c == 1) {
                isAllowedToShow = true;
            }
        }
    });
}