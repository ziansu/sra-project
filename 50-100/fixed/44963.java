private int giveBackNextFreeField() {
    if (((size()) + 1) < (arrayList.length)) {
        return size();
    }else {
        arrayList = giveBackIncreasedArray(arrayList);
        return (size()) + 1;
    }
}