private Note getNote(int matrixNumber) {
    return new Note((((matrixNumber - 1) * 15) + 1), (((int) (java.lang.Math.floor(((matrixNumber - 1) / 15)))) + 1));
}