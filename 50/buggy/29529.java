private void detachPresenter(boolean withDestroy) {
    if ((presenter) != null) {
        presenter.onViewDetached();
        if (!withDestroy)
            presenter.onDestroy();
        
        presenter = null;
    }
}