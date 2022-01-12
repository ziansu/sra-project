public nodebox.node.Node disconnect(nodebox.node.Connection connection) {
    com.google.common.base.Preconditions.checkArgument(getConnections().contains(connection), "Node %s does not have a connection %s", this, connection);
    com.google.common.collect.ImmutableList.Builder<nodebox.node.Connection> b = com.google.common.collect.ImmutableList.builder();
    for (nodebox.node.Connection c : getConnections()) {
        if (c != connection)
            b.add(c);
        
    }
    return newNodeWithAttribute(nodebox.node.Node.Attribute.CONNECTIONS, b.build());
}