@java.lang.Override
public android.view.View getPrototypeView(android.content.Context context) {
    android.view.View prototypeView = android.view.View.inflate(context, R.layout.brick_go_to, null);
    android.widget.Spinner goToSpinner = ((android.widget.Spinner) (prototypeView.findViewById(R.id.brick_go_to_spinner)));
    android.widget.SpinnerAdapter goToSpinnerAdapter = createArrayAdapter(context);
    goToSpinner.setAdapter(goToSpinnerAdapter);
    setSpinnerSelection(goToSpinner);
    return prototypeView;
}