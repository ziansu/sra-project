@java.lang.Override
public org.musetest.core.step.StepExecutionResult executeImplementation(org.musetest.core.step.StepExecutionContext context) throws org.musetest.core.step.StepExecutionError {
    _context = context;
    if (shouldEnter(context)) {
        org.musetest.core.step.StepExecutionContext new_context = createStepExecutionContextForChildren(context);
        if (new_context == null)
            return new org.musetest.core.step.BasicStepExecutionResult(StepExecutionStatus.COMPLETE);
        
        context.getTestExecutionContext().getExecutionStack().push(new_context);
        beforeChildrenExecuted(new_context);
        return new org.musetest.core.step.BasicStepExecutionResult(StepExecutionStatus.INCOMPLETE);
    }else {
        afterChildrenExecuted(context);
        return new org.musetest.core.step.BasicStepExecutionResult(StepExecutionStatus.COMPLETE);
    }
}