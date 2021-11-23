public java.lang.Object get(int index) {
    if (index <= (elementData.length)) {
        return elementData[index];
    }else {
        return null;
    }
}