private void resetPianos(float width, float height) {
    pianoA.setSize(width, height);
    pianoB.setSize(width, height);
    pianoAB.setSize(width, height);
    float cenx = getCenx();
    float ceny = getCeny();
    pianoA.setCenter(cenx, (ceny - height));
    pianoB.setCenter(cenx, (ceny + height));
    pianoAB.setCenter(cenx, ceny);
}