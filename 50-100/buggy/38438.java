public void swap(int index1, int index2) {
    java.lang.String temp = english.get(index1);
    english.set(index1, english.get(index2));
    english.set(index2, temp);
    temp = chinese.get(index1);
    chinese.set(index1, chinese.get(index2));
    chinese.set(index2, chinese.get(index1));
}