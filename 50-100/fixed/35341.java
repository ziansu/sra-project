public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.button :
            android.util.Log.d(com.example.huang.sudoku.MainActivity.TAG, "DOES NOT WORK");
            break;
        case R.id.button2 :
            openNewGameDialog();
            break;
        case R.id.button3 :
            android.content.Intent i = new android.content.Intent(this, com.example.huang.sudoku.About.class);
            startActivity(i);
            break;
        case R.id.button4 :
            finish();
            break;
    }
}