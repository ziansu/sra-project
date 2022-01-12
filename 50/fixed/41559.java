public java.util.List<com.example.garorasu.bay.Model.Vehicle> getParkedVehicles() {
    java.lang.String selectQuery = ((("SELECT  * FROM " + (VehicleTable.NAME)) + " WHERE ") + (VehicleTable.COLUMN_OCP)) + " = ?";
    return getVehicles(selectQuery, new java.lang.String[]{ "true" });
}