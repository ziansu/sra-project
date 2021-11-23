@java.lang.Override
public void onClick(android.view.View view) {
    try {
        presenter.calculateSum(java.lang.Integer.parseInt(input1.getText().toString()), java.lang.Integer.parseInt(input2.getText().toString()));
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
        android.widget.Toast.makeText(this, "Number Exception", Toast.LENGTH_SHORT).show();
    }
}