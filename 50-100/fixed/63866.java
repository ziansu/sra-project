public model.MathElement turnColorBackTo(java.awt.Color color) {
    if (((mLastMathElementModified) != null) && (contains(mLastMathElementModified))) {
        if ((mLastMathElementModified.getColor()) != color) {
            mLastMathElementModified.setColor(color);
            mRedFlag = false;
            return mLastMathElementModified;
        }
    }
    mLastMathElementModified = null;
    return null;
}