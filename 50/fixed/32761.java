public void setExpand(boolean isExpand) {
    this.isExpand = isExpand;
    if (!isExpand) {
        for (com.example.acer.hello.Node node : children) {
            node.setExpand(false);
        }
    }
}