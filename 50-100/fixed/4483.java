public void addDatasetByID(thredds.catalog.InvDatasetImpl ds) {
    if (((ds.getID()) != null) && (ds.getID().startsWith("null")))
        java.lang.System.out.printf("HEY addDatasetByID %s%n", ds.getID());
    
    if ((ds.getID()) != null)
        dsHash.put(ds.getID(), ds);
    
}