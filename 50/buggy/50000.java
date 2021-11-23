public void run() {
    doFileUpload();
    getActivity().runOnUiThread(new java.lang.Runnable() {
        public void run() {
        }
    });
}