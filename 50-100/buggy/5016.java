private void createCircuitConnection() {
    try {
        if ((((mCurrentSelectedComponent) != null) && ((mPreviouslySelectedComponent) != null)) && (!(mCurrentSelectedComponent.equals(mPreviouslySelectedComponent)))) {
            mCircuit.addConnection(mPreviouslySelectedComponent, mCurrentSelectedComponent);
            mCircuitView.invalidate();
        }
    } catch (gerardogtn.com.circuitsolver.util.exception.CannotConnectTwoGatesException e) {
        android.support.design.widget.Snackbar.make(mCircuitView, R.string.cannot_connect_two_gates, Snackbar.LENGTH_SHORT).show();
    }
}