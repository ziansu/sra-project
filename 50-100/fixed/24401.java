@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if (((mLastPath) == null) || (mLastPath.equals("")))
        return ;
    
    org.brandroid.utils.Logger.LogDebug(("Saving instance last path = " + (mLastPath.getPath())));
    outState.putString("last", mLastPath.getPath());
    super.onSaveInstanceState(outState);
}