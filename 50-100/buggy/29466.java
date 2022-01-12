private void init() {
    selectedItems = new java.util.ArrayList<>();
    switch (selectionType) {
        case SINGLE :
            selectionEnabled = true;
            setSelectionLimit(1);
            break;
        case MULTIPLE :
            selectionEnabled = true;
            break;
        case MULTIPLE_ON_LONG_PRESS :
            selectionEnabled = false;
            break;
        default :
            throw new java.lang.IllegalArgumentException("Selection type not Supported");
    }
    setOnItemClickListener(snapOnItemClickListener);
}