public void assignNodeID() {
    java.lang.String node_id = java.lang.System.getenv("gamenode_id");
    this.node_id = node_id;
    java.lang.System.out.println((("GameNode " + node_id) + " initiated."));
}