@java.lang.Override
protected void onLoad(android.os.Bundle savedInstanceState) {
    super.onLoad(savedInstanceState);
    this.getContacts.execute(new leonardo2204.com.br.flowtests.presenter.FirstScreenPresenter.GetContactsSubscriber(), new android.os.Bundle(0));
}