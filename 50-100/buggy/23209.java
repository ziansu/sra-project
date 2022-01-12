public void onClick(android.view.View v) {
    if ((value.getText().toString().length()) < 1) {
        android.widget.Toast.makeText(this, "please enter name", Toast.LENGTH_LONG).show();
    }else {
        pb.setVisibility(View.VISIBLE);
        new com.example.daniel.myapplication.test.SendScore.MyAsyncTask().execute(value.getText().toString());
    }
}