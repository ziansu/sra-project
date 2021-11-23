@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    highlightCurrentFragment(position);
    super.setPrimaryItem(container, position, object);
}