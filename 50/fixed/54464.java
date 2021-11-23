@java.lang.Override
public void onSelect() {
    if (!(allAimsSelected())) {
        setAimFilters();
        model.showSelectionPossibility(getPossibleAims());
    }else {
        perform();
    }
}