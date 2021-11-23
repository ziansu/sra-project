public boolean checkValid(java.lang.String path) {
    java.util.Stack<java.lang.String> stack = new java.util.Stack<java.lang.String>();
    java.lang.String[] folders = path.split("/");
    for (java.lang.String str : folders) {
        if (str.equals("..")) {
            if (stack.isEmpty()) {
                return false;
            }else {
                stack.pop();
            }
        }else {
            stack.push(str);
        }
    }
    return true;
}