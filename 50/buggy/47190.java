@java.lang.Override
protected void onStop() {
    super.onStop();
    presenter.setView(null);
    presenter.stop();
    _suscription.unsubscribe();
}