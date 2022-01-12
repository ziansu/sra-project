private void findFile(java.lang.String name, java.io.File file) {
    java.io.File[] list = file.listFiles();
    if (list != null) {
        for (java.io.File fil : list) {
            if (fil.isDirectory()) {
                findFile(name, fil);
            }else
                if (name.equalsIgnoreCase(fil.getName())) {
                    iptool.Iptool.path = fil.getParent();
                    break;
                }
            
        }
    }
}