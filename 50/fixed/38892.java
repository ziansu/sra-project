@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.widget.Toast.makeText(getActivity(), "On Destroy", Toast.LENGTH_SHORT).show();
}