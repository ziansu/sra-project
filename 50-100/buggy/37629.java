@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof com.mateuszkoslacz.moviper.base.presenter.CommonBasePresenter))
        return false;
    
    com.mateuszkoslacz.moviper.base.presenter.CommonBasePresenter<?> that = ((com.mateuszkoslacz.moviper.base.presenter.CommonBasePresenter<?>) (o));
    if (!(getName().equals(that.getName())))
        return false;
    
    return getClassName().equals(that.getClassName());
}