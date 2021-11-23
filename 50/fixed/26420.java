@java.lang.Override
public void onItemClick(int position) {
    if ((listener) != null) {
        listener.showTranslateFragment(list.get(position));
    }
}