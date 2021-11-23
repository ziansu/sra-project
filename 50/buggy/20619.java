@java.lang.Override
protected void onPostExecute(final java.lang.String[] result) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        public void run() {
            updateMonthView(result);
        }
    });
}