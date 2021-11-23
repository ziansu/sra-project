void build() {
    super.build();
    if ((children) != null) {
        for (BaseNode node : children)
            node.build();
        
    }
}