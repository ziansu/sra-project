@java.lang.Override
protected void notifyComponentOnDestroy(boolean isChangingConfigurations) {
    if ((!(com.anadeainc.exampledagger.common.SimpleActivity.isChangingConfigurations())) && ((presenter) != null))
        presenter.destroy();
    
    presenter = null;
}