public void onCycle() {
    (bombTimer)--;
    if ((getDetenate()) == true) {
        myLocObj.setMapObject(new com.example.bombertruckbackend.Explode(myLocObj));
        exploded = true;
    }
    if ((bombTimer) < 0) {
        if ((exploded) == false) {
            onExplode();
        }
    }
    setCycleMuxTrue();
}