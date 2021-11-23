@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int pos, long l) {
    if (pos == 0) {
        sectionSelectedListener.onSectionSelected(null);
    }else {
        sectionSelectedListener.onSectionSelected(sections.get((pos - 1)));
    }
}