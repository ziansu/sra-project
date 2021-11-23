@java.lang.Override
public void onSuccess(org.sagebionetworks.repo.model.Entity table) {
    step2.configure(table, tableType);
    modalPresenter.setNextActivePage(step2);
}