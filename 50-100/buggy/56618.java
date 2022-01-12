void processNode(org.asciidocgenerator.domain.navigation.NavigationTreeNode node, javax.servlet.jsp.JspWriter jspWriter, boolean hiddenNode) throws java.io.IOException {
    if (node.getChilds().isEmpty()) {
        jspWriter.print(createNodeTag(node, hiddenNode));
    }else {
        jspWriter.print(createFolderStartTag(node, hiddenNode));
        iterateFolder(node.getChilds(), jspWriter, true);
        jspWriter.print(createFolderEndTag());
    }
}