public void onInvoke() throws leon.codegen.runtime.LeonCodeGenEvaluationException {
    if ((invocationsLeft) < 0) {
        return ;
    }else
        if ((invocationsLeft) == 0) {
            throw new leon.codegen.runtime.LeonCodeGenEvaluationException("Maximum number of invocations reached.");
        }else {
            (invocationsLeft)--;
        }
    
}