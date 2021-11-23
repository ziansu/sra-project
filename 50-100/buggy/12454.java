@java.lang.Override
protected void onPostExecute(java.lang.Boolean b) {
    super.onPostExecute(b);
    if (b) {
        if ((mListener) != null) {
            mListener.onEditionSuccess();
        }
    }else {
        android.widget.Toast.makeText(getActivity(), R.string.tags_edition_failed, Toast.LENGTH_SHORT).show();
    }
}