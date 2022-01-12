private android.view.View inflateView(android.widget.LinearLayout cardHolder) {
    cardHolder.removeAllViews();
    int detailLayout = args.getInt(de.aw.cash.action.VIEWHOLDERLAYOUT);
    for (de.aw.gv.SplitZeile sz : mSplittBuchung.getSplitZeilen()) {
        if (!(sz.isRemoved())) {
            android.view.View splitZeileView = android.view.View.inflate(getContext(), detailLayout, cardHolder);
            splitZeileView.setTag(sz);
            viewMap.put(sz, splitZeileView);
        }
    }
    return cardHolder;
}