void addEvent(int y, int m, int d, int h, int mi, java.lang.String s, int i) throws java.lang.Exception {
    DataBox newBox = new DataBox(y, m, d, h, mi, s, i);
    dataStruct.add(newBox);
    reorganize();
}