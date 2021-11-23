private final byte RotateY(byte X, byte Y, int CounterClockwiseSteps) {
    switch (CounterClockwiseSteps) {
        case 1 :
            return X;
        case 2 :
            return ((byte) (7 - Y));
        case 3 :
            return ((byte) (7 - X));
        default :
            return Y;
    }
}