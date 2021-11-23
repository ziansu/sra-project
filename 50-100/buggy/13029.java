public void stopped() {
    if ((option) == '1') {
        java.lang.System.out.println("Moving");
        distance += 0.2F * ((acc) / 100);
        acc -= 0.1F;
        if ((acc) < 0) {
            option = '3';
            Gdis = distance;
            distance = 0.0F;
            acc = Cacc;
        }
    }
}