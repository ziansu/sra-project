java.lang.String createNodeTag(org.asciidocgenerator.domain.navigation.NavigationTreeNode node) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("<li id='");
    sb.append(node.getNavigationPath());
    sb.append("' >");
    sb.append(buildDescriptorForLayout(node, this::buildPlaceholderForLayout));
    sb.append("</li>");
    return sb.toString();
}