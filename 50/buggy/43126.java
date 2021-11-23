public int getExpCost(int index) {
    if (index <= (expCost.length)) {
        return expCost[index];
    }else {
        return expCost[((expCost.length) - 1)];
    }
}