public void editEvent(int selected, int m, int d, int h, int mi, java.lang.String s, int i) throws java.lang.Exception {
    DataBox edit = new DataBox(m, d, h, mi, s, i);
    dataStruct.add(edit);
    dataStruct.remove(selected);
    reorganize();
}