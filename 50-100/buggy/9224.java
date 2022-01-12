private void resetPianos(float width, float height) {
    pianoA.setSize(width, height);
    pianoB.setSize(width, height);
    pianoAB.setSize(width, height);
    float cenx = getCenx();
    float ceny = getCeny();
    pianoA.setCenter(cenx, ceny);
    pianoB.setCenter(cenx, ceny);
    pianoAB.setCenter(cenx, ceny);
}