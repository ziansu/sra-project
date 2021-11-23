@java.lang.Override
@javax.annotation.OverridingMethodsMustInvokeSuper
public void setUserName(java.lang.String s) throws NamedBean.BadUserNameException {
    java.lang.String old = mUserName;
    mUserName = jmri.NamedBean.normalizeUserName(s);
    firePropertyChange("UserName", old, mUserName);
}