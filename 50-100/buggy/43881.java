private static void addAccount(de.greenrobot.daogenerator.Schema schema) {
    de.greenrobot.daogenerator.Entity note = schema.addEntity("AccountInfo");
    note.addIdProperty().primaryKey().autoincrement();
    note.addStringProperty("tel").notNull().primaryKey();
    note.addStringProperty("userid");
    note.addStringProperty("flowcoins");
    note.addStringProperty("isregistration");
    note.addStringProperty("makeflow");
    note.addStringProperty("useflow");
}