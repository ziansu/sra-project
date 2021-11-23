private boolean isXInSheet(float x) {
    return (!(isTablet)) || ((x >= (sheetStartX)) && (x <= (sheetEndX)));
}