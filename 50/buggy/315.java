public void transformRootTreeToJson(final org.sonar.api.utils.text.JsonWriter jsonWriter, final de.rinderle.softvis3d.domain.tree.RootTreeNode tree) {
    jsonWriter.beginObject();
    jsonWriter.name("treeResult");
    this.transformTreeToJson(jsonWriter, tree);
    jsonWriter.endObject();
    jsonWriter.close();
}