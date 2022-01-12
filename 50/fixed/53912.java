@java.lang.Override
protected void notifyComponentOnDestroy(boolean isChangingConfigurations) {
    if ((!isChangingConfigurations) && ((presenter) != null))
        presenter.destroy();
    
    presenter = null;
}