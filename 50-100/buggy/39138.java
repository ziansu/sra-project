private void parseGopherDirectories(java.io.File dir, java.lang.String defaultDir) {
    for (java.io.File f : dir.listFiles(gopherFnf)) {
        black.arpanet.gopher.db.GophermapDbLoader.loadGophermap(f, defaultDir, domainName, port);
    }
    for (java.io.File d : dir.listFiles(dirF)) {
        parseGopherDirectories(d, ((defaultDir + (d.getName())) + "/"));
    }
}