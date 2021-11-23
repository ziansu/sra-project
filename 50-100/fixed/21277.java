public static org.kframework.backend.java.kil.KItem of(org.kframework.backend.java.kil.Term kLabel, org.kframework.backend.java.kil.Term kList, org.kframework.backend.java.kil.TermContext termContext, org.kframework.backend.java.kil.Source source, org.kframework.backend.java.kil.Location location) {
    kList = org.kframework.backend.java.kil.KCollection.upKind(kList, Kind.KLIST);
    return new org.kframework.backend.java.kil.KItem(kLabel, kList, termContext, termContext.global().kItemOps.tool, source, location);
}