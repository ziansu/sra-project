@java.lang.Override
public void addChild(@org.eclipse.jdt.annotation.NonNull
java.lang.String field, @org.eclipse.jdt.annotation.NonNull
com.steelypip.powerups.minxmlstar.MinXMLStar value) throws java.lang.UnsupportedOperationException {
    if ((this.links) == null) {
        this.links = new java.util.TreeMap<>();
    }
    java.util.ArrayList<com.steelypip.powerups.minxmlstar.@org.eclipse.jdt.annotation.NonNull
    FlexiMinXMLStar> flinks = this.links.get(field);
    if (flinks == null) {
        flinks = new java.util.ArrayList<>();
    }
    @org.eclipse.jdt.annotation.NonNull
    final com.steelypip.powerups.minxmlstar.FlexiMinXMLStar fv = toFlexiMinXMLStar(value);
    flinks.add(fv);
}