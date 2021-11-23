@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    it.bsdsoftware.library.BSDImage image = adapter.getItem(position);
    it.bsdsoftware.library.BSDUtility.handleClickItem(getActivity(), image, gallery);
}