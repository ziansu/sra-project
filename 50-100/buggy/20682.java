public static void lessThan(java.util.Stack<java.lang.String> input) {
    java.lang.String top;
    java.lang.String nextTop;
    int a;
    int b;
    int result;
    top = input.pop();
    a = java.lang.Integer.parseInt(top);
    nextTop = input.pop();
    b = java.lang.Integer.parseInt(nextTop);
    if (a < b)
        result = 1;
    else
        result = 0;
    
    input.push(nextTop);
    input.push(top);
    input.push(java.lang.Integer.toString(result));
}