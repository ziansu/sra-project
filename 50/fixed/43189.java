@java.lang.Override
public void setRememberUser(boolean rememberUser) {
    this.rememberUser = rememberUser;
    storage.put(com.triangleleft.flashcards.service.account.SimpleAccountModule.KEY_REMEMBER_USER, rememberUser);
}