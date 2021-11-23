private void deletePage() {
    int position = viewPager.getCurrentItem();
    fragmentList.remove(position);
    pagerAdapter.notifyDataSetChanged();
}