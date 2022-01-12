@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    mListener.onSectionClicked(sectionsList.get(i));
}