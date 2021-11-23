public static void main(java.lang.String[] args) {
    edu.wright.cs.jfiles.database.DatabaseController.createTables();
    int id1 = edu.wright.cs.jfiles.database.DatabaseController.createRole("NONE");
    java.lang.System.out.println(("NONE: id=" + id1));
    int id2 = edu.wright.cs.jfiles.database.DatabaseController.createRole("ADMIN");
    java.lang.System.out.println(("ADMIN: id=" + id2));
    edu.wright.cs.jfiles.database.DatabaseController.createUser("Bill Gates", "windows_vista", 1);
    edu.wright.cs.jfiles.database.DatabaseController.createUser("Steve Jobs", "earpods", 12);
    edu.wright.cs.jfiles.database.DatabaseController.shutdown();
}