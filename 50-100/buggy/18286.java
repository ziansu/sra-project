@java.lang.Override
public void modifyMarkerTypeData(com.sample.thesis17.mytimeapp.DB.tables.MarkerTypeData mtd) {
    try {
        com.j256.ormlite.dao.Dao<com.sample.thesis17.mytimeapp.DB.tables.MarkerTypeData, java.lang.Integer> daoMarkerTypeDataInteger = getDatabaseHelperMain().getDaoMarkerTypeData();
        if (daoMarkerTypeDataInteger != null) {
            selectedMarkerTypeData.setStrTypeName(mtd.getStrTypeName());
            selectedMarkerTypeData.setStrMemo(mtd.getStrMemo());
            daoMarkerTypeDataInteger.update(selectedMarkerTypeData);
            markerTypeDataFragmentAdapter.notifyDataSetChanged();
        }else {
            android.util.Log.d("MarkerTypeDataFragment", "cannot open daoMarkerTypeDataInteger");
        }
    } catch (java.sql.SQLException e) {
        android.util.Log.d("MarkerTypeDataFragment", "debugPrintDAOInfo SQL exception");
    }
}