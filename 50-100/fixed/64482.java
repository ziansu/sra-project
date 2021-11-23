@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    inflater.inflate(R.menu.add_on_selector_menu, menu);
    menu.findItem(R.id.add_on_market_search_menu_option).setVisible(((getMarketSearchTitle()) != 0));
    menu.findItem(R.id.tweaks_menu_option).setVisible(mHasTweaksOption);
}