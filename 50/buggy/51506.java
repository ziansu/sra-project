@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0)
        return com.sam_chordas.android.stockhawk.ui.HistoricalListFragment.newInstance(mItems);
    
    return com.sam_chordas.android.stockhawk.ui.LineGraphFragment.newInstance(mItems);
}