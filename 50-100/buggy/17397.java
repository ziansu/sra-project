@java.lang.Override
public boolean onCreateActionMode(final android.view.ActionMode mode, final android.view.Menu menu) {
    final android.view.MenuInflater inflater = mode.getMenuInflater();
    inflater.inflate(R.menu.multiselect_lists, menu);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        getActivity().getWindow().setStatusBarColor(de.azapps.material_elements.utils.ThemeManager.getColor(R.attr.colorCABStatus));
    }
    final int count = mAdapter.getSelectedItemCount();
    mode.setTitle(getResources().getQuantityString(R.plurals.list_multiselect_title, count, count));
    return true;
}