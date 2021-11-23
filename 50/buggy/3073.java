@java.lang.Override
public void exec(com.ninty.runtime.NiFrame frame) {
    com.ninty.runtime.OperandStack stack = frame.getOperandStack();
    long num1 = stack.popLong();
    long num2 = stack.popLong();
    stack.pushLong((num1 % num2));
}