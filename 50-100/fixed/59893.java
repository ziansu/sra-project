VerticalViewPager.ItemInfo addNewItem(int position, int index) {
    VerticalViewPager.ItemInfo ii = new VerticalViewPager.ItemInfo();
    ii.position = position;
    ii.object = mAdapter.instantiateItem(this, position);
    ii.heightFactor = mAdapter.getPageHeight(position);
    if ((index < 0) || (index >= (mItems.size()))) {
        mItems.add(ii);
    }else {
        mItems.add(index, ii);
    }
    return ii;
}