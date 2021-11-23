@java.lang.Override
public boolean onCreate() {
    appsandmaps.temple.edu.content_provider.UpdateActivityClass GetData = new appsandmaps.temple.edu.content_provider.UpdateActivityClass();
    GetData.delegate = this;
    GetData.execute();
    mDbHelper = new appsandmaps.temple.edu.content_provider.MyContentProvider.FitnessDBHelper(getContext());
    return false;
}