public void setBaseCurveProgressView(com.vlad1m1r.lemniscate.BaseCurveProgressView baseCurveProgressView) {
    mBaseCurveProgressView = baseCurveProgressView;
    if (((mBaseCurveProgressView) instanceof com.vlad1m1r.lemniscate.BernoullisProgressView) || ((mBaseCurveProgressView) instanceof com.vlad1m1r.lemniscate.GeronosProgressView)) {
        mCheckBoxHasHole.setEnabled(true);
    }else {
        mCheckBoxHasHole.setEnabled(false);
    }
    invalidateView(mBaseCurveProgressView);
}