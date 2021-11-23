@java.lang.Override
public boolean execute(jp.ac.nii.prl.mape.execution.model.View view) {
    for (jp.ac.nii.prl.mape.execution.model.Instance create : view.getAdditions()) {
        createInstance(create);
    }
    java.util.Collection<java.lang.String> termIds = new java.util.ArrayList<>();
    for (jp.ac.nii.prl.mape.execution.model.Instance term : view.getTerminations()) {
        termIds.add(term.getInstId());
    }
    return terminateInstances(termIds);
}