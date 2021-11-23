public void searchStarted() {
    searching = true;
    status.setText((((getString(R.string.doing)) + " ") + (getHint(viewPager.getCurrentItem()))));
    waitView.setVisibility(View.VISIBLE);
}