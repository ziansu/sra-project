void popEmpties() {
    while (!(stack.empty())) {
        if (!(stack.peek().hasNext())) {
            stack.pop();
        }else {
            return ;
        }
    } 
}