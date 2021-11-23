public float getMinimumSpan(int axis) {
    switch (axis) {
        case javax.swing.text.View.X_AXIS :
            return 0.0F;
        case javax.swing.text.View.Y_AXIS :
            return super.getMinimumSpan(axis);
        default :
            throw new java.lang.IllegalArgumentException(("Invalid axis: " + axis));
    }
}