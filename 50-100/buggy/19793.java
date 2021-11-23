public void del(android.view.View view) {
    if (!(board.getText().toString().isEmpty())) {
        board.setText("");
    }else {
        android.widget.Toast.makeText(this, "Its already empty", Toast.LENGTH_SHORT).show();
    }
}