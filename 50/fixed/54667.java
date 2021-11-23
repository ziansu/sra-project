@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.bloc.blocspot.blocspot.BlocSpotApplication.mDatabase = new com.bloc.blocspot.database.BlocSpotDbHelper(getApplicationContext());
    com.bloc.blocspot.blocspot.BlocSpotApplication.context = getApplicationContext();
}