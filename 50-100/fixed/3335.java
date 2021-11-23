public void decreaseValue(int position) {
    if ((numValue) > (minValue)) {
        positions.remove(position);
        (numValue)--;
        setAdapter(new au.edu.adelaide.mci.kidnumeracy.component.NumObjectGridView.NumObjectImageAdapter());
        fireAfterNumChangedEvent(((numValue) + 1));
    }
}