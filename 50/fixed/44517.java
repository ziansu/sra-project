private void returnToParent() {
    if ((currentCSTNode.getParent()) != null)
        currentCSTNode = currentCSTNode.getParent();
    
}