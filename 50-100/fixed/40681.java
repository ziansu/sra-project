@java.lang.Override
public void refreshContent(com.github.mikephil.charting.data.Entry e, int dataSetIndex) {
    if (e instanceof com.github.mikephil.charting.data.CandleEntry) {
        com.github.mikephil.charting.data.CandleEntry ce = ((com.github.mikephil.charting.data.CandleEntry) (e));
        tvContent.setText(("" + (com.github.mikephil.charting.utils.Utils.formatNumber(ce.getHigh(), 1, true))));
    }else {
        tvContent.setText(("" + (com.github.mikephil.charting.utils.Utils.formatNumber(e.getVal(), 1, true))));
    }
}