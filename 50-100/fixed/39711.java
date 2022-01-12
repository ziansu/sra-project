public synchronized void setDelegate(org.springsource.ide.eclipse.commons.livexp.core.LiveExpression<java.util.Set<T>> newDelegate) {
    org.springsource.ide.eclipse.commons.livexp.core.LiveExpression<java.util.Set<T>> oldDelegate = this.delegate;
    this.delegate = newDelegate;
    if (oldDelegate == newDelegate) {
        return ;
    }else {
        if (oldDelegate != null) {
            oldDelegate.removeListener(delegateListener);
        }
        if (newDelegate == null) {
            org.springframework.ide.eclipse.boot.dash.livexp.DelegatingLiveSet.refresh();
        }else {
            newDelegate.addListener(delegateListener);
        }
    }
}