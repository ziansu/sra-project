@java.lang.Override
public void addAccount(com.phoenix.soft.agenda.module.Account account) {
    if (account == null) {
        account = repository.getRandomAccount();
    }
    view.showNewAccount();
}