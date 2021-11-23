@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (null != (mListener)) {
        mListener.onFragmentInteraction(DummyContent.ITEMS.get(position).id);
    }
}