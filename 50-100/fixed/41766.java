@java.lang.Override
public void run() {
    if ((mInvest) == null) {
        return ;
    }
    mArrayAdapter.clear();
    final java.util.List<org.bitcoin.market.bean.MarketInfo> markets;
    markets = mInvest.getMarkets();
    for (org.bitcoin.market.bean.MarketInfo mi : markets) {
        mArrayAdapter.add(mi.toString());
    }
    mArrayAdapter.notifyDataSetChanged();
}