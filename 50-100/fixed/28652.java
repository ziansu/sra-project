public double[] getHaralickMinMax() {
    switch (this) {
        case HUE :
            return null;
        case RED :
        case GREEN :
        case BLUE :
        case BRIGHTNESS :
            return new double[]{ 0 , 1 };
        case SATURATION :
            return new double[]{ 0 , 1 };
        case OD :
            return new double[]{ 0 , 2.5 };
        case STAIN_1 :
        case STAIN_2 :
        case STAIN_3 :
            return new double[]{ 0 , 1.5 };
        default :
            return null;
    }
}