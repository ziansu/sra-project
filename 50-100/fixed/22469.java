private void resetLocAndDim() {
    for (int i = 0; i < (dimensions.length); i++) {
        if ((dimensions[i]) < 0) {
            location[i] = (location[i]) + (dimensions[i]);
            dimensions[i] = (-1) * (dimensions[i]);
        }
    }
}