private void createShortToast(java.lang.String message) {
    if ((super.getActivity()) != null) {
        android.widget.Toast.makeText(super.getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}