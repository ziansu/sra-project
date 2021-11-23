protected void onPause() {
    com.yandex.metrica.YandexMetrica.onPauseActivity(this);
    super.onPause();
    onResume();
}