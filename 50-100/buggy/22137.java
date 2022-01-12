private char charAtLocal(int index) {
    if ((data) != null) {
        return data[index];
    }
    int fc = front.count;
    if (fc > index) {
        return front.charAtLocal(index);
    }
    return back.charAtLocal(index);
}