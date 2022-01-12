public void run() {
    if ((bitmaps.size()) != 0) {
        setPositionNext();
        imageSwitcher.setImageDrawable(new android.graphics.drawable.BitmapDrawable(getResources(), bitmaps.get(position)));
        imageSwitcher.postDelayed(this, 2000);
    }
}