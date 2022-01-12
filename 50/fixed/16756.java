@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    android.widget.Toast.makeText(getActivity(), ("click --" + position), Toast.LENGTH_SHORT).show();
}