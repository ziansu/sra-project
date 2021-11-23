@java.lang.Override
public void run() {
    mLineGraph.setDatas(datas);
    mHighest_TV.setText(java.lang.String.format("%.2f", getHighestPrice(datas)));
    mLowest_TV.setText(java.lang.String.format("%.2f", getLowestPrice(datas)));
    mAverage_TV.setText(java.lang.String.format("%.2f", getAveragePrice(datas)));
}