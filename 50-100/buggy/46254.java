@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    nl.tue.san.tasks.TaskSet displayed = taskSetManager.get(position);
    android.widget.ListView listView = new android.widget.ListView(getContext());
    listView.setAdapter(new nl.tue.san.ui.TaskSetFragment.TaskAdapter(taskSetManager.get(position)));
    container.addView(listView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    return displayed;
}