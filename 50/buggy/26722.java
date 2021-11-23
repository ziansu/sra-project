public void setWeightUp() {
    (weightID)++;
    weight = getWeightNum();
    if ((weight) == 0) {
        (weightID)--;
        weight = getWeightNum();
    }
}