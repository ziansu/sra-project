public void pi() {
    if (!(valueResetFlag)) {
        enter();
        calcStack.push(java.lang.Math.PI);
        historyStack.push(PI);
        multiply();
    }else {
        calcStack.push(java.lang.Math.PI);
        historyStack.push(PI);
        printHistory();
        updateOperationValue(java.lang.Math.PI);
        if (historyResetFlag) {
            historyValue = new java.lang.StringBuilder();
            historyResetFlag = false;
        }
    }
}