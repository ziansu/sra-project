private void resize() {
    java.lang.Integer[] result = new java.lang.Integer[(stack.length) * 2];
    int i;
    for (i = 0; i < (stack.length); i++) {
        result[i] = stack[i];
    }
    while (i < (result.length)) {
        result[i] = null;
    } 
    stack = result;
}