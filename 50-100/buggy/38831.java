private double getWeight(final int position) {
    switch (this.weightMethod) {
        case LOGARITHMIC :
            return java.lang.Math.log(position);
        case LINEAR :
            return position;
        case EXPONENTIAL :
            return java.lang.Math.exp(position);
        default :
            return position;
    }
}