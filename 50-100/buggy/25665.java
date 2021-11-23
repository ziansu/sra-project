@java.lang.Override
public double calculate(java.lang.String expression) throws ru.mipt.java2016.homework.base.task1.ParsingException {
    if (expression == null) {
        throw new ru.mipt.java2016.homework.base.task1.ParsingException("Expression is null");
    }
    expression = expression.replaceAll("[ \\n\\t]", "");
    if ((expression.length()) == 0) {
        throw new ru.mipt.java2016.homework.base.task1.ParsingException("Expression is empty");
    }
    postfix = new java.util.Stack<>();
    numbers = new java.util.Stack<>();
    toPostfix(expression);
    return calculateWithStack();
}