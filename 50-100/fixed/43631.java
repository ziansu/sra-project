private static java.lang.String getSourcePtText(nu.mine.mosher.collection.TreeNode<nu.mine.mosher.gedcom.GedcomLine> node) {
    final java.util.Collection<nu.mine.mosher.collection.TreeNode<nu.mine.mosher.gedcom.GedcomLine>> rNode = new java.util.ArrayList<>();
    nu.mine.mosher.gedcom.model.Loader.getChildren(node, rNode);
    for (final nu.mine.mosher.collection.TreeNode<nu.mine.mosher.gedcom.GedcomLine> n : rNode) {
        final nu.mine.mosher.gedcom.GedcomLine line = n.getObject();
        final nu.mine.mosher.gedcom.GedcomTag tag = line.getTag();
        if (tag.equals(GedcomTag.DATA)) {
            return nu.mine.mosher.gedcom.model.Loader.parseData(n);
        }
    }
    return "";
}