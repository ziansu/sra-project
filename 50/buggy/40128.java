public static com.iconmaster.source.util.Result addLibs(com.iconmaster.source.link.LinkSpace ls) {
    for (com.iconmaster.source.prototype.SourcePackage pkg : ls.si.libraries) {
        ls.si.println(VerboseLevel.DEBUG, ("Loading package: " + pkg));
        ls.addPackage(pkg);
    }
    return new com.iconmaster.source.util.Result(true);
}