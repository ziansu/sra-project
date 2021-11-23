@java.lang.Override
protected void onPostExecute(final java.lang.Integer integer) {
    super.onPostExecute(integer);
    if ((getActivity()) != null) {
        if (integer < 0) {
            android.widget.Toast.makeText(this.context, getString(R.string.ServerError), Toast.LENGTH_LONG).show();
        }else {
            this.tableAdded(integer);
        }
    }
}