public void setCell(int cellNumber, int[] dots) throws java.lang.Exception {
    if ((cellNumber >= (cellObserver.size())) || (cellNumber < 1)) {
        java.lang.Exception error = new java.lang.Exception("Enter a legal cell number");
        throw error;
    }
    if ((dots.length) != 6) {
        java.lang.Exception error = new java.lang.Exception("Must set value for 6 dots");
        throw error;
    }
    cellObserver.set(cellNumber, dots);
}