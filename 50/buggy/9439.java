@java.lang.Override
public void exec(com.ninty.runtime.NiFrame frame) {
    com.ninty.runtime.OperandStack stack = frame.getOperandStack();
    int num1 = stack.popInt();
    int num2 = stack.popInt();
    stack.pushInt((num1 / num2));
}