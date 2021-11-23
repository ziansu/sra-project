@java.lang.Override
public void onPageSelected(int position) {
    android.widget.Toast.makeText(getActivity(), ("Selected page position: " + position), Toast.LENGTH_SHORT).show();
}