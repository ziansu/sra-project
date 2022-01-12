private static void parseElements(org.verapdf.features.FeaturesObjectTypesEnum type, org.verapdf.features.tools.FeaturesCollection collection, org.w3c.dom.Element root, org.w3c.dom.Document doc) {
    for (org.verapdf.features.tools.FeatureTreeNode rootNode : collection.getFeatureTreesForType(type)) {
        if (rootNode != null) {
            root.appendChild(org.verapdf.report.XMLFeaturesReport.makeNode(rootNode, collection, doc, false));
        }
    }
}