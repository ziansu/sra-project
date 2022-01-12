public static java.lang.String count(java.lang.String task) {
    java.lang.String[] parsedTask = ua.com.juja.ExampleSolver.parseToRPN(task);
    java.lang.String res = java.lang.String.valueOf(ua.com.juja.ExampleSolver.stackMachine(parsedTask));
    return res.substring(((res.length()) - 2)).equals(".0") ? res.substring(0, ((res.length()) - 2)) : res;
}