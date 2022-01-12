@java.lang.Override
protected com.rivetlogic.mobile.liferaytodoslibrary.interactor.TodosBaseInteractor createInteractor(java.lang.String actionName) {
    if ((singleInteractor) == null) {
        singleInteractor = new com.rivetlogic.mobile.liferaytodoslibrary.interactor.taskbyuserid.TaskByUserIdInteractorImpl(getScreenletId(), this.context);
    }
    return singleInteractor;
}