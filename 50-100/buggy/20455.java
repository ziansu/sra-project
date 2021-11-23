@java.lang.Override
public void onItemClick(java.lang.String path) {
    if ((activity) instanceof com.ivpicker.Gallery.OnFragmentResult) {
        if (multiSelection) {
            changeSelectionCount(adapter.getSelectionCount());
        }else {
            java.util.ArrayList<java.lang.String> paths = new java.util.ArrayList<>();
            paths.add(path);
            ((com.ivpicker.Gallery.OnFragmentResult) (activity)).setResult(paths);
        }
    }
}