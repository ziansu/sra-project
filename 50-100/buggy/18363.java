public void continousToDoubleMatrix() {
    java.lang.System.out.println("run");
    java.lang.String[] tmp;
    count = 0;
    writeBytesSerial();
    while (portScanner.hasNextLine()) {
        tmp = portScanner.nextLine().split(", ");
        for (int i = 0; i < (nbrOfColumns); i++) {
            continuousMatrix[count][i] = java.lang.Double.parseDouble(tmp[i]);
        }
        setCount(count);
        (count)++;
    } 
}