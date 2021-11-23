@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
    final android.widget.ImageView toolbar_logo = ((android.widget.ImageView) (getActivity().findViewById(R.id.toolbar_logo)));
    toolbar_logo.setVisibility(View.VISIBLE);
    return true;
}