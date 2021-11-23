@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    if ((listDataModel.isEmpty()) || ((leftPanelList.getSelectedValue()) == null)) {
        return ;
    }
    final krasa.mavenrun.analyzer.MyListNode myListNode = ((krasa.mavenrun.analyzer.MyListNode) (leftPanelList.getSelectedValue()));
    java.util.List<org.jetbrains.idea.maven.model.MavenArtifactNode> artifacts = myListNode.value;
    fillRightTree(artifacts);
}