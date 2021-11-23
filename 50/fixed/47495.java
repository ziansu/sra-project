@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    this.onItemClick(i);
    if (listener != null)
        listener.onItemClick(adapterView, view, i, l);
    
}