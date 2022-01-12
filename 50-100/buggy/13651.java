@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    boolean updateSuccess = false;
    if (getName().equals("BTC"))
        try {
            setValue(java.lang.Double.parseDouble(result));
            updateSuccess = true;
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(("Parsing Exception for BTC, result = " + result));
        }
    else
        updateSuccess = parseRateFromJSONString(result);
    
    if (updateSuccess) {
        mTimeLastUpdated = new java.util.Date();
    }
    mUpdating = false;
    if ((mCallback) != null)
        mCallback.updateDynamicUnitButtons("Updating");
    
}