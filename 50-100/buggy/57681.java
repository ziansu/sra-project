@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    if (viewHashMap.containsKey(object)) {
        android.view.View itemView = viewHashMap.get(object);
        viewHashMap.remove(object);
        container.removeView(itemView);
    }
}