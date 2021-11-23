@java.lang.Override
public void success(java.util.List<de.fau.cs.mad.fablab.rest.core.ICal> iCals, retrofit.client.Response response) {
    if (iCals.isEmpty()) {
        android.widget.Toast.makeText(getBaseContext(), R.string.product_not_found, Toast.LENGTH_LONG).show();
    }
    newsList.clear();
    for (de.fau.cs.mad.fablab.rest.core.ICal iCal : iCals) {
        iCalList.add(iCal);
    }
    datesSlidePagerAdapter = new de.fau.cs.mad.fablab.android.ui.NewsActivity.DatesSlidePagerAdapter(getSupportFragmentManager(), iCalList);
    datesViewPager.setAdapter(datesSlidePagerAdapter);
}