private int giveBackNextFreeField() {
    if ((size()) < (arrayList.length)) {
        return (size()) + 1;
    }else {
        arrayList = giveBackIncreasedArray(arrayList);
        return (size()) + 1;
    }
}