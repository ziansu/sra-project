private void moveToMain() {
    if (bredesh.medico.MainActivity.active)
        finish();
    else {
        startActivity(toMain);
        finish();
    }
}