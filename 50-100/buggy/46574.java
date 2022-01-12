public void wrgBt() {
    clikcount();
    rand();
    if ((Answer) == 0) {
        (com.example.yehia.guessthecolor.MainActivity.wrgCount)++;
        android.widget.Toast.makeText(this, "right answer keep going", Toast.LENGTH_SHORT).show();
    }else {
        (com.example.yehia.guessthecolor.MainActivity.wrgCount)--;
        android.widget.Toast.makeText(this, "wrong answer try again", Toast.LENGTH_SHORT).show();
    }
    GameOver();
}