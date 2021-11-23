@java.lang.Override
public android.support.v4.app.Fragment getItem(int i) {
    com.pwhitman.neonpasswordsafe.Password password = mPasswords.get(i);
    return com.pwhitman.neonpasswordsafe.PasswordFragment.newInstance(password.getId());
}