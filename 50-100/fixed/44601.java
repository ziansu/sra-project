public static void sort(android.app.Activity context, java.util.ArrayList<? extends us.koller.cameraroll.util.SortUtil.Sortable> sortables, int by) {
    switch (by) {
        case us.koller.cameraroll.util.SortUtil.BY_NAME :
            us.koller.cameraroll.util.SortUtil.sortByName(sortables);
            break;
        case us.koller.cameraroll.util.SortUtil.BY_DATE :
            us.koller.cameraroll.util.SortUtil.sortByDate(context, sortables);
            break;
    }
}