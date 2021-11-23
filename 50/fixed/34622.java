private int removeView(android.support.v4.view.ViewPager pager, int position) {
    pager.setAdapter(null);
    cardDetails.remove(position);
    pager.setAdapter(this);
    this.notifyDataSetChanged();
    return position;
}