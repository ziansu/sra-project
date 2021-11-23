private int getWeightRight() {
    if ((weightRight) == 0) {
        return rightSubTree.getTotalWeight();
    }else {
        return weightRight;
    }
}