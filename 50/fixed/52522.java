@java.lang.Override
public void refresh(org.springframework.ide.eclipse.boot.dash.model.UserInteractions ui) {
    org.springframework.ide.eclipse.boot.dash.cloudfoundry.ops.Operation<java.lang.Void> op = new org.springframework.ide.eclipse.boot.dash.cloudfoundry.ops.TargetApplicationsRefreshOperation(this, ui);
    getOperationsExecution(ui).runOpAsynch(op);
}