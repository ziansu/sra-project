private void deleteSelected() {
    java.util.Map<ru.sukharev.pathtracker.utils.orm.MapPath, java.lang.Boolean> map = mAdapter.getCheckedMap();
    for (ru.sukharev.pathtracker.utils.orm.MapPath path : map.keySet()) {
        if (map.get(path)) {
            deletePathFromDatabase(path);
            mAdapter.remove(path);
        }
    }
}