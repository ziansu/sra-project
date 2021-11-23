@java.lang.Override
public void selectItem(int position) {
    mCallbacks.onItemSelected(this.items.get(position));
}