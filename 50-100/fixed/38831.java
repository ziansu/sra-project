private double getWeight(final int position, final int size) {
    switch (this.weightMethod) {
        case LOGARITHMIC :
            return java.lang.Math.log(position);
        case LINEAR :
            return position;
        case EXPONENTIAL :
            return java.lang.Math.exp((position - size));
        default :
            return position;
    }
}