private static void check() {
    if ((meta.DataManager.data) == null)
        meta.DataManager.data = new meta.Data();
    
    java.lang.System.out.println((("Created new data object (" + (meta.DataManager.i)) + ")"));
    (meta.DataManager.i)++;
}