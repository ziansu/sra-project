@java.lang.Override
protected void onPostExecute(java.lang.Integer lastPageSelected) {
    if ((this.lastPageSelected) != 0) {
        return ;
    }
    if (lastPageSelected != null) {
        this.lastPageSelected = lastPageSelected.intValue();
        viewPager.setCurrentItem(this.lastPageSelected);
    }
    onPageSelected(this.lastPageSelected);
}