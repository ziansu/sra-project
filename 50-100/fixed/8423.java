@java.lang.Override
public homework.hw3.DoubleStack clone() throws java.lang.CloneNotSupportedException {
    homework.hw3.DoubleStack stackclone = new homework.hw3.DoubleStack();
    for (int i = (stack.size()) - 1; i >= 0; i--) {
        stackclone.push(stack.get(i));
    }
    return stackclone;
}