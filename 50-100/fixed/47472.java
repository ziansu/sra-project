public void updateList() {
    hotDealsDataBase = new trendsapps.org.trendsharer.DatabaseHandler(trendsapps.org.trendsharer.DatabaseHandler.DATABSENAME, "HotDeals", getActivity());
    java.util.ArrayList<trendsapps.org.trendsharer.HotDeal> dealsTemp = hotDealsDataBase.getDeals();
    int i = 0;
    while (i < (dealsTemp.size())) {
        hotdeals.add(dealsTemp.get(i));
        i++;
    } 
    hotDealAdapter = new trendsapps.org.trendsharer.HotDealAdapter(hotdeals);
    recyclerView.setAdapter(hotDealAdapter);
    hotdeals = new java.util.ArrayList<trendsapps.org.trendsharer.HotDeal>();
}