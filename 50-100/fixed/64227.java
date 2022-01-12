public void toggleTransliterationSize(android.view.View view) {
    int id = view.getId();
    if (id == (R.id.decreaseTransliterationSize)) {
        if ((transliterationFontSize) > 10) {
            transliterationFontSize -= 2;
        }
    }else
        if (id == (R.id.increaseTransliterationSize)) {
            if ((transliterationFontSize) < 30) {
                transliterationFontSize += 2;
            }
        }
    
    shabadView.getAdapter().notifyDataSetChanged();
}