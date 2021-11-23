public void onDrawerItemClicked(int index) {
    com.hotb.pgmacdesign.materialdesignexamples.logging.L.m(("Pager called at position " + index));
    if (index == 0) {
        android.content.Intent intent = new android.content.Intent(this, com.hotb.pgmacdesign.materialdesignexamples.activities.ActivityA.class);
        startActivity(intent);
    }else {
        index -= 1;
    }
    mPager.setCurrentItem(index);
}