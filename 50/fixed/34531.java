@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    mProgressDialog.hide();
    if ((getActivity()) != null) {
        getActivity().setRequestedOrientation(mOldOrientation);
        doMasterClear();
    }
}