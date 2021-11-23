private java.io.FileWriter fileforFace(int i) {
    if (i == 0) {
        return front;
    }
    if (i == 1) {
        return right;
    }
    if (i == 2) {
        return left;
    }
    if (i == 3) {
        return down;
    }
    if (i == 4) {
        return top;
    }
    return back;
}