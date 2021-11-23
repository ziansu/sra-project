public void del(android.view.View view) {
    if ((!(board.getText().toString().isEmpty())) || (!(result.getText().toString().isEmpty()))) {
        board.setText("");
        result.setText("");
    }else {
        android.widget.Toast.makeText(this, "Its already empty", Toast.LENGTH_SHORT).show();
    }
}