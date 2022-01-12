@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    try {
        android.widget.TextView tvNumber = ((android.widget.TextView) (view.findViewById(R.id.tvSearchNumber)));
        int num = java.lang.Integer.parseInt(tvNumber.getText().toString());
        goToPsalter(num);
    } catch (java.lang.Exception ex) {
        android.widget.Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
    }
}