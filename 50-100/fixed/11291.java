public void pop() {
    astnodes.ASTNode topOfItemStack = itemStack.peek();
    while (((stack.size()) > 0) && ((stack.peek().parentCompound) == topOfItemStack)) {
        stack.pop();
    } 
}