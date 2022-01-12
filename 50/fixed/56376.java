public void removeNamespace(java.lang.String prefix) {
    java.util.Deque<java.lang.String> namespaceStack = prefixes.get(prefix);
    if (namespaceStack != null) {
        namespaceStack.removeLast();
    }
}