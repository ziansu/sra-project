java.lang.String javacode() {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    b.append(((("\nelse if(" + (negation ? "!" : "")) + (com.gatf.selenium.Command.IfCommand.getFp(cond, children, negation))) + "){}"));
    return b.toString();
}