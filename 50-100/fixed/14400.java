@java.lang.Override
protected void onPostExecute(final java.lang.Boolean success) {
    super.onPostExecute(success);
    if ((getActivity()) != null) {
        if (success) {
            android.widget.Toast.makeText(this.context, getString(R.string.ResetSuccess), Toast.LENGTH_LONG).show();
        }else {
            android.widget.Toast.makeText(this.context, errorMessage, Toast.LENGTH_LONG).show();
        }
    }
}