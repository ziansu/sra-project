public static int getNextId(java.io.File folder, java.lang.String split, java.lang.String name) {
    return de.superioz.moo.api.utils.IOUtil.getNextId(folder, name, split, "", 1);
}