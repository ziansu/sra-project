private boolean isSpaceOpen(int coordinates, int buttonWidth, android.view.View layout) {
    boolean spaceOpen = true;
    switch (layout.getId()) {
        case R.id.rel1 :
            spaceOpen = arrayOccupancyCheck(coordinates, buttonWidth, drumPlacement1);
            break;
        case R.id.rel2 :
            spaceOpen = arrayOccupancyCheck(coordinates, buttonWidth, drumPlacement2);
            break;
        default :
            android.util.Log.i(com.example.android.musicmash.MainActivity.TAG, "isSpaceOpen method case default - parent view wasn't rel1 or rel2");
            break;
    }
    return spaceOpen;
}