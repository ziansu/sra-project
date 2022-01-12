@java.lang.Override
public boolean onCreate() {
    mDbHelper = new appsandmaps.temple.edu.content_provider.MyContentProvider.FitnessDBHelper(getContext());
    return false;
}