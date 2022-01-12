private void getPaths(final pf.query.Path.Node node, final java.util.List<pf.query.Path> ans) {
    ans.add(pf.query.Path.singleElementPath(node).append(new pf.query.Path.AttributeNode(id, id), pf.query.Path.singleElementPath(new pf.query.Path.ValueNode("ASD"))));
    if ((followingAttributes) != null) {
        followingAttributes.getPaths(node, ans);
    }
}