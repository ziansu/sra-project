public void fetchContacts(boolean mustHaveNumber) {
    if ((getView()) == null)
        return ;
    
    if ((getView().contacts_rv.getAdapter()) != null)
        ((leonardo2204.com.br.flowtests.ContactsAdapter) (getView().contacts_rv.getAdapter())).clearAdapter();
    
    android.os.Bundle bundle = new android.os.Bundle(1);
    bundle.putBoolean("mustHaveNumber", mustHaveNumber);
    this.getContacts.execute(new leonardo2204.com.br.flowtests.presenter.FirstScreenPresenter.GetContactsSubscriber(), bundle);
}