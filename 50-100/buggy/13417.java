public android.hardware.Camera.Size getPreviewSize(java.util.List<android.hardware.Camera.Size> list, int th) {
    java.util.Collections.sort(list, sizeComparator);
    int i = 0;
    for (android.hardware.Camera.Size s : list) {
        if (((s.width) > th) && (equalRate(s, 1.333F))) {
            break;
        }
        i++;
    }
    return list.get(i);
}