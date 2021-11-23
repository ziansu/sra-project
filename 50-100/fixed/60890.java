@java.lang.Override
public void storeUserList(java.lang.String identifier, java.util.ArrayList<BoardModules.User> usr_list) {
    java.lang.String file_name = ((BoardConfiguration.BoardConfiguration.COMMON_STORAGE_PATH) + identifier) + (BoardConfiguration.BoardConfiguration.USER_STORAGE_PATH);
    java.beans.XMLEncoder enc = null;
    try {
        enc = new java.beans.XMLEncoder(new java.io.FileOutputStream(file_name));
        enc.writeObject(usr_list);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Fehler: Liste konnte nicht gespeichert werden");
        e.printStackTrace();
    } finally {
        if (enc != null) {
            enc.close();
        }
    }
}