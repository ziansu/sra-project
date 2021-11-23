private main.java.pl.lodz.p.ftims.poid.exercise3.model.Complex[] transformSignalToComplex(int[] buffer) {
    int size = buffer.length;
    main.java.pl.lodz.p.ftims.poid.exercise3.model.Complex[] complex = new main.java.pl.lodz.p.ftims.poid.exercise3.model.Complex[size];
    for (int i = 0; i < size; i++) {
        complex[i] = new main.java.pl.lodz.p.ftims.poid.exercise3.model.Complex(buffer[i], 0.0);
    }
    return complex;
}