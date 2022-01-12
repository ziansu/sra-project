public model.MathElement turnColorBackTo(java.awt.Color color) {
    if ((mLastMathElementModified) != null) {
        if ((mLastMathElementModified.getColor()) != color) {
            mLastMathElementModified.setColor(color);
            mRedFlag = false;
            return mLastMathElementModified;
        }
    }
    return null;
}