@java.lang.Override
protected void onPostExecute(java.lang.Integer result) {
    super.onPostExecute(result);
    if (result == 0) {
        android.widget.Toast.makeText(getActivity(), getResources().getString(R.string.no_data_available), Toast.LENGTH_LONG).show();
    }
    mCallback.closeActivity();
}