@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if (((mLastPath) == null) || (mLastPath.equals("")))
        return ;
    
    org.brandroid.utils.Logger.LogDebug(("Saving instance last path = " + (mLastPath.getPath())));
    outState.putString("last", mLastPath.getPath());
}