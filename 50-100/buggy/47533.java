@java.lang.Override
public void onPageSelected(int i) {
    com.pwhitman.passwordvault.Password p = mPasswords.get(i);
    mCurrentPass = p;
    if ((p.getTitle()) != null) {
        setTitle(p.getTitle());
    }else {
        setTitle(R.string.new_password);
    }
}