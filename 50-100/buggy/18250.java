@java.lang.Override
public void factorial() throws java.rmi.RemoteException {
    int result = 1;
    int currentOperand = ((int) (getCurrentOperand()));
    if (currentOperand < 0) {
        setCurrentOperand(new com.calculator.common.Result("Invalid input"));
        return ;
    }
    for (int i = ((int) (getCurrentOperand())); i > 1; --i)
        result *= i;
    
    setCurrentOperand(new com.calculator.common.Result(result));
}