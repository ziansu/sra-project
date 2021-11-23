@java.lang.Override
public void exec(com.ninty.runtime.NiFrame frame) {
    com.ninty.runtime.OperandStack stack = frame.getOperandStack();
    double num1 = stack.popDouble();
    double num2 = stack.popDouble();
    stack.pushDouble((num1 / num2));
}