public void keywords(java.lang.String userName, java.sql.Statement stmt) {
    java.lang.String houseID = null;
    java.lang.System.out.println("Here is a list of the houses you own.");
    listOwnedHouses(userName, stmt);
    java.lang.System.out.println("\n");
    java.lang.System.out.println("Select which house you wish to view/update/create keywords for.");
    houseID = verifyHouseID(userName, stmt);
    if (houseID != null) {
        Ubook.Keyword keys = new Ubook.Keyword();
        keys.setUp(houseID, stmt);
    }
}