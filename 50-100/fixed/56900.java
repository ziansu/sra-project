public static void main(java.lang.String[] args) throws java.lang.ClassNotFoundException {
    DatabaseShell.InitializeDatabase();
    Controller.InitializeMasterLists();
    Controller.InitializeSectorList();
    View v = new View();
    for (Sector sect : Controller.SECTOR_LIST.values()) {
        v.AddSector(sect.getName(), sect.getId(), sect.getCoords()[0], sect.getCoords()[1]);
    }
}