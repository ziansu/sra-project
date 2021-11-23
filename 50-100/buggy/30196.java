private static java.lang.String findFile(java.lang.String name, java.io.File file) {
    java.lang.String filepath = null;
    java.io.File[] list = file.listFiles();
    if (list != null)
        for (java.io.File fil : list) {
            if (fil.isDirectory()) {
                filepath = iptool.Iptool.findFile(name, fil);
            }else
                if (name.equalsIgnoreCase(fil.getName())) {
                    filepath = fil.getParent();
                }
            
        }
    
    return filepath;
}