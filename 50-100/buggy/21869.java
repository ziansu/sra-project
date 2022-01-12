@java.lang.Override
public void onClick(android.view.View v) {
    printAllPersistent();
    if ((mApp) != null)
        if (mApp.getPackageName().toString().equals(mContext.getPackageName()))
            android.support.design.widget.Snackbar.make(mContainer, mContext.getString(R.string.error_hide_lens_launcher), Snackbar.LENGTH_LONG).show();
        else
            toggleAppVisibility(mApp);
        
    else
        android.support.design.widget.Snackbar.make(mContainer, mContext.getString(R.string.error_unable_to_open), Snackbar.LENGTH_LONG).show();
    
}