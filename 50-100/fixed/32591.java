public void GameOver() {
    if (((com.example.yehia.guessthecolor.MainActivity.righCount) >= 10) || ((com.example.yehia.guessthecolor.MainActivity.wrgCount) >= 10)) {
        android.widget.Toast.makeText(this, (("GAME OVER YOUR SCORE IS EQUALE  " + (((com.example.yehia.guessthecolor.MainActivity.righCount) / (com.example.yehia.guessthecolor.MainActivity.wrgCount)) * 100)) + "%"), Toast.LENGTH_LONG).show();
    }
}