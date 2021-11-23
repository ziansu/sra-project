public void onCycle() {
    (bombTimer)--;
    if ((getDetenate()) == true) {
        myLocObj.setMapObject(new com.example.bombertruckbackend.Explode(myLocObj));
    }
    if ((bombTimer) < 0) {
        if ((exploded) == false) {
            onExplode();
        }
    }
    setCycleMuxTrue();
}