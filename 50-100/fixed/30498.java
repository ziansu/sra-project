private void getWeekPager(java.lang.String group) {
    this.group = group;
    nl.jelletenbrinke.saxionroosters.extras.NetworkAsyncTask getWeekPagerTask = new nl.jelletenbrinke.saxionroosters.extras.NetworkAsyncTask(this, this, true);
    java.lang.String url = ((nl.jelletenbrinke.saxionroosters.extras.S.URL) + (nl.jelletenbrinke.saxionroosters.extras.S.QUERY)) + group;
    getWeekPagerTask.execute(url, S.PARSE_WEEK_PAGER);
}