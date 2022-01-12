public java.lang.Object pop() {
    if (this.outStack.isEmpty()) {
        while (!(this.inStack.isEmpty()))
            this.outStack.push(this.inStack.pop());
        
        this.inStack = new java.util.Stack<java.lang.Object>();
    }
    return !(this.outStack.isEmpty()) ? this.outStack.pop() : false;
}