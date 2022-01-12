public void removeFeatureTable(final io.github.msdk.datamodel.featuretables.FeatureTable featureTable) {
    super.removeFeatureTable(featureTable);
    for (javafx.scene.control.TreeItem<?> df1 : featureTableRootItem.getChildren()) {
        if ((df1.getValue()) == featureTable) {
            featureTableRootItem.getChildren().remove(df1);
            break;
        }
    }
}