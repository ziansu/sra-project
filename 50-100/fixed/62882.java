@java.lang.Override
public void onAttach(android.app.Activity context) {
    super.onAttach(context);
    curContext = context;
    android.util.Log.d("MarkerTypeDataFragment", "onAttach");
    try {
        daoMarkerTypeDataInteger = getDatabaseHelperMain().getDaoMarkerTypeData();
        if ((daoMarkerTypeDataInteger) != null) {
            markerTypeDataList = daoMarkerTypeDataInteger.queryForAll();
        }else {
            android.util.Log.d("MarkerTypeDataFragment", "cannot open daoMarkerTypeDataInteger");
        }
    } catch (java.sql.SQLException e) {
        android.util.Log.d("MarkerTypeDataFragment", "debugPrintDAOInfo SQL exception");
    }
}