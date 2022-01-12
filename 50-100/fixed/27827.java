public void onClick(android.view.View v) {
    android.content.Intent solverActivityIntent = new android.content.Intent(getApplicationContext(), com.test.cad.breadcrumbs.activities.SolverActivity.class);
    solverActivityIntent.putExtra("StairCost", mStairCost);
    solverActivityIntent.putExtra("DispMode", mDisplayMode);
    solverActivityIntent.putExtra("ConvertMode", mConvertMode);
    solverActivityIntent.putExtra("AlgMode", mAlgMode);
    solverActivityIntent.putExtra("PathWidth", mPathWidth);
    solverActivityIntent.putExtra("PathColor", mPathColor);
    solverActivityIntent.putExtra("PhotoPath", "null");
    startActivity(solverActivityIntent);
}