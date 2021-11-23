@java.lang.Override
public void showError(final java.lang.String error) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
        }
    });
}