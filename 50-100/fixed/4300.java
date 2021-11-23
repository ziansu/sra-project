private static int getViewIndexOf(com.flarestar.drones.views.viewgroups.BaseDroneViewGroup parent, android.view.View view, int index) {
    for (; index != (parent.getChildCount()); ++index) {
        if ((parent.getChildAt(index)) == view) {
            return index;
        }
    }
    return -1;
}