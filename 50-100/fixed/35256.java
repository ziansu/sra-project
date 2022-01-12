public void stepIn(tlang.javizer_tools.TJavizable javizable) {
    tlang.javizer_tools.TJavizable[] newStack = new tlang.javizer_tools.TJavizable[(stack.length) + 1];
    for (int i = 0; i < (stack.length); i++) {
        newStack[i] = stack[i];
    }
    newStack[stack.length] = javizable;
    stack = newStack;
}