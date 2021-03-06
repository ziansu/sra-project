private void searchTree(java.io.File file, int depth) {
    java.io.File[] files = file.listFiles();
    java.lang.String _depth = new java.lang.String(new char[depth]).replace(' ', '-');
    for (java.io.File _file : files) {
        if ((_file.isDirectory()) && (_file != null)) {
            java.lang.System.out.println((_depth + (_file.getName())));
            searchTree(_file, (depth + 1));
        }
    }
}