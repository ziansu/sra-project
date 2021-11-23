void addEvent(int m, int d, int h, int mi, java.lang.String s, int i) throws java.lang.Exception {
    DataBox newBox = new DataBox(m, d, h, mi, s, i);
    dataStruct.add(newBox);
    reorganize();
}