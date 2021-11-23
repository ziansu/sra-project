private int getPreferredHeight() {
    if ((getChildCount()) == 0)
        return 0;
    
    android.view.View view = getChildAt(0);
    view.measure(nz.ac.auckland.lablet.views.table.MeasureSpec.makeMeasureSpec(0, MeasureSpec.AT_MOST), nz.ac.auckland.lablet.views.table.MeasureSpec.makeMeasureSpec(0, MeasureSpec.AT_MOST));
    return view.getMeasuredHeight();
}