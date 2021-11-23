@java.lang.Override
public void compareSelectedVersions(java.util.List<java.lang.String> agbversion1, java.util.List<java.lang.String> agbversion2) {
    java.lang.System.out.println("Starte AGB-Vergleich: ");
    java.lang.System.out.println("Achtung: Folgende Aenderung haben sich ergeben! ");
    difflib.Patch patch1 = difflib.DiffUtils.diff(agbversion1, agbversion2);
    for (difflib.Delta delta : patch1.getDeltas()) {
        java.lang.System.out.println((delta + (com.agb.compare.AGBComparator.LINE_SEPARATOR)));
        versionDifferences.add(delta.toString());
    }
}