private void setNavigation() {
    boolean prev = (_aiList.getPrev(_infoType, _reference)) != null;
    boolean next = (_aiList.getNext(_infoType, _reference)) != null;
    if (null != (_btnNext)) {
        _btnNext.setEnabled(next);
    }
    if (null != (_btnPrev)) {
        _btnPrev.setEnabled(prev);
    }
}