@java.lang.Override
protected void detachFragment() {
    super.onDetach();
    mListener = null;
}