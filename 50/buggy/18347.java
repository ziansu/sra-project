@java.lang.Override
@javax.annotation.OverridingMethodsMustInvokeSuper
public void setUserName(java.lang.String s) throws NamedBean.BadUserNameException {
    java.lang.String old = mUserName;
    if (s != null)
        mUserName = jmri.NamedBean.normalizeUserName(s);
    else
        mUserName = null;
    
    firePropertyChange("UserName", old, mUserName);
}