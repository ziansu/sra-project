private android.view.View inflateView(android.widget.LinearLayout cardHolder) {
    cardHolder.removeAllViews();
    android.view.LayoutInflater inflater = getActivity().getLayoutInflater();
    int detailLayout = args.getInt(de.aw.cash.action.VIEWHOLDERLAYOUT);
    for (de.aw.gv.SplitZeile sz : mSplittBuchung.getSplitZeilen()) {
        if (!(sz.isRemoved())) {
            android.view.View splitZeileView = inflater.inflate(detailLayout, cardHolder);
            splitZeileView.setTag(sz);
            viewMap.put(sz, splitZeileView);
        }
    }
    return cardHolder;
}