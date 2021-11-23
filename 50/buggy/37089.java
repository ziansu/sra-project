@butterknife.OnClick(value = R.id.buttonAddTurn)
public void addInning(android.view.View view) {
    addTurnButton.hide(new android.support.design.widget.FloatingActionButton.OnVisibilityChangedListener() {
        @java.lang.Override
        public void onHidden(android.support.design.widget.FloatingActionButton fab) {
            super.onHidden(fab);
            showAddTurnDialog();
        }
    });
}