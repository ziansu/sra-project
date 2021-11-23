@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    if ((mConditionArrayAdapter) == null) {
        mConditionArrayAdapter = new com.nucc.hackwinds.ConditionArrayAdapter(getActivity(), mForecastModel.getConditionsForIndex(0));
        setListAdapter(mConditionArrayAdapter);
    }
}