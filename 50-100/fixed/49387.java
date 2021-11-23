@java.lang.Override
public int includesToChoose(final int tx, final int ty) {
    boolean temp = false;
    int numberOfCard = 0;
    if (empty()) {
        return numberOfCard;
    }
    for (int i = 0; i < (activeCards); i++) {
        if (i == 0) {
            temp = true;
        }
        if (includeForToChoose(tx, (ty + (35 * i)), temp)) {
            numberOfCard = i + 1;
        }
        temp = false;
    }
    return numberOfCard;
}