public void run() {
    mediaPlayer.stop();
    ponerLog(((("Has agotado el tiempo!! " + " Te han quedado ") + ((casillas) + 1)) + " Casillas por descubrir"));
    android.content.Intent intent = new android.content.Intent(this, com.example.allu.buscaminas.ResultActivity.class);
    intent.putExtra("log", log);
    intent.putExtra("resultado", "Lose");
    startActivity(intent);
    finish();
}