public void receive(java.util.List<cz.pavelpilar.calculator.graphs.Function> functions) {
    mFunctions.addAll(functions);
    mGraph.setNoDataText(getString(R.string.graphs_loading));
    new cz.pavelpilar.calculator.graphs.GraphFragment.CalculateValuesTask().execute(functions.toArray(new cz.pavelpilar.calculator.graphs.Function[functions.size()]));
}