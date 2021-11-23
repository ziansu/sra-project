public eagleeye.entities.Directory findDir(java.util.ArrayList<eagleeye.entities.Directory> db, int ID) {
    for (eagleeye.entities.Directory checkParent : db) {
        if ((checkParent.getDirectoryID()) == ID) {
            return checkParent;
        }
    }
    return null;
}