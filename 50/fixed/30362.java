public void run() {
    toAdd.setImageDrawable(initialCur);
    if (isAllowedToPressLocal) {
        toAdd.setOnClickListener(this);
    }
    if (c == 1) {
        isAllowedToShow = true;
    }
}