@java.lang.Override
protected void onPostExecute(java.lang.Integer lastPageSelected) {
    if (lastPageSelected != null) {
        if ((this.lastPageSelected) == 0) {
            viewPager.setCurrentItem(lastPageSelected.intValue());
            this.lastPageSelected = lastPageSelected.intValue();
            onPageSelected(this.lastPageSelected);
        }
    }
}