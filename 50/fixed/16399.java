public java.lang.String getPriority() {
    if ((priority.equals("-1")) || (priority.equals("0"))) {
        return "*";
    }
    return priority;
}