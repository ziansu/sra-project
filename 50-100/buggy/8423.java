@java.lang.Override
public homework.hw3.DoubleStack clone() throws java.lang.CloneNotSupportedException {
    homework.hw3.DoubleStack stackclone = new homework.hw3.DoubleStack();
    double m = stack.getLast();
    try {
        for (int i = stack.indexOf(m); i >= 0; i--) {
            stackclone.push(stack.get(i));
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.CloneNotSupportedException("Cloning unsuccessful.");
    }
    return stackclone;
}