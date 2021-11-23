private void deleteSelected() {
    java.util.Map<ru.sukharev.pathtracker.utils.orm.MapPath, java.lang.Boolean> map = mAdapter.getCheckedMap();
    try {
        for (ru.sukharev.pathtracker.utils.orm.MapPath path : map.keySet()) {
            if (map.get(path)) {
                deletePathFromDatabase(path);
                mAdapter.remove(path);
            }
        }
    } catch (java.sql.SQLException e) {
        android.widget.Toast.makeText(getContext(), getString(R.string.error_delete_path), Toast.LENGTH_LONG).show();
        e.printStackTrace();
    }
}