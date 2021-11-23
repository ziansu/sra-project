public long getInsertionTime() {
    long total = 0;
    if (time.containsKey(Constants.TIME_LEAF_INSERTION.str)) {
        java.lang.System.out.println("insertion time");
        java.util.Stack<java.lang.Long> stack = time.get(Constants.TIME_LEAF_INSERTION.str);
        while (!(stack.empty())) {
            total += stack.pop();
        } 
    }
    return total;
}