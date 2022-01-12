public void run() {
    try {
        java.lang.Thread.sleep(((1500 / 2) - 250));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            toAdd.requestLayout();
            toAdd.setImageDrawable(initialCur);
            if (c == 5) {
                isAllowedToShow = true;
            }
        }
    });
}