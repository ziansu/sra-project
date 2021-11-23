private static void makeList(java.lang.String listName, java.util.List<org.verapdf.features.tools.FeatureTreeNode> list, org.w3c.dom.Element parent, org.verapdf.features.tools.FeaturesCollection collection, org.w3c.dom.Document doc) {
    if (!(list.isEmpty())) {
        org.w3c.dom.Element listElement = doc.createElement(listName);
        for (org.verapdf.features.tools.FeatureTreeNode node : list) {
            if (node != null) {
                listElement.appendChild(org.verapdf.report.XMLFeaturesReport.makeNode(node, collection, doc));
            }
        }
        parent.appendChild(listElement);
    }
}