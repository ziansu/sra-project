public void add(float currency) {
    com.sungjae.app.showmethemoney.log.MyLog.d(ctx, ("GRAPH_ADD = " + currency));
    if (currency == 0)
        return ;
    
    series.appendData(new com.jjoe64.graphview.series.DataPoint(((idx)++), currency), true, com.sungjae.app.showmethemoney.activity.main.CurrencyGraph.MAX);
}