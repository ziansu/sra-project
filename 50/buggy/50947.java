public void registerListener(com.brookmanholmes.bma.ui.addturnwizard.fragments.BreakFragment fragment) {
    this.fragment = fragment;
    if ((modelCallbacks) instanceof com.brookmanholmes.bma.ui.addturnwizard.model.AddTurnWizardModel) {
        fragment.updateView(((com.brookmanholmes.bma.ui.addturnwizard.model.AddTurnWizardModel) (modelCallbacks)).getTableStatus().getBallStatuses());
    }
}