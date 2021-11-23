@butterknife.OnClick(value = R.id.refresh)
public void refresh() {
    mcv.setCurrentItemByDelta(1, false);
    mcv.setCurrentItemByDelta((-1), false);
}