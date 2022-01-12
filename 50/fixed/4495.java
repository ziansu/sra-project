public void run(android.view.View view) {
    wireController.redrawWires();
    ((android.widget.GridView) (findViewById(R.id.circuit))).invalidateViews();
    circuitController.run(this);
    checkScenarioComplete();
}