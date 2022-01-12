@java.lang.Override
public void onPageSelected(int position) {
    isimages = position;
    imagePagerGallery.setCurrentItem(position);
    for (int i = 0; i < (dotsCount); i++) {
        dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem));
    }
    dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditem));
}