public void traverse(graphql.language.Node root, graphql.validation.QueryLanguageVisitor queryLanguageVisitor) {
    traverseImpl(root, queryLanguageVisitor, path);
}