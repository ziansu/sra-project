@java.lang.Override
public void getNewTurnInfo(com.brookmanholmes.bma.ui.addturnwizard.model.AddTurnWizardModel model) {
    for (int ball = 1; ball <= (model.getTableStatus().size()); ball++) {
        tableStatus.setBallTo(model.getTableStatus().getBallStatus(ball), ball);
    }
    updateFragment();
}