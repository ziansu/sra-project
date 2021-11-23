@java.lang.Override
public void onSuccess(org.sagebionetworks.repo.model.Entity table) {
    modalPresenter.setLoading(false);
    step2.configure(table, tableType);
    modalPresenter.setNextActivePage(step2);
}