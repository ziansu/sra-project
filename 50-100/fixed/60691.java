private int vyhodnotHod(int kolik) {
    if (aktualniHrac.isDistanc()) {
        if (kolik > 6) {
            aktualniHrac.setDistanc(false);
            status("Mužeš hrát, házej znovu");
            return 0;
        }else {
            status("Tak snad příště");
            return 1;
        }
    }
    if (kolik == 12) {
        status("Hodil jsi 2x 6 - musíš na distanc");
        aktualniHrac.setDistanc(true);
        return 1;
    }
    return 2;
}