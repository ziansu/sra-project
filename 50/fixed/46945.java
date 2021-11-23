public java.util.List<com.example.garorasu.bay.Model.Vehicle> getVehicleByVid(java.lang.String vid) {
    java.lang.String selectQuery = ((("SELECT * FROM " + (VehicleTable.NAME)) + " WHERE ") + (VehicleTable.COLUMN_VID)) + " = ?";
    return getVehicles(selectQuery, new java.lang.String[]{ vid });
}