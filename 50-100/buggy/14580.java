@java.lang.Override
public java.lang.Object call(org.jsoup.nodes.Element element, java.util.List<com.virjar.sipsoup.parse.expression.SyntaxNode> params) {
    com.google.common.base.Preconditions.checkArgument(((params.size()) >= 2), "contains need 2 params");
    return params.get(0).calc(element).toString().contains(params.get(1).toString());
}