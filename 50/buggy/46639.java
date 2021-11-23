@java.lang.Override
public boolean onCreate() {
    mDbHelper = new com.ferg.awfulapp.provider.AwfulProvider.DatabaseHelper(getContext());
    return true;
}