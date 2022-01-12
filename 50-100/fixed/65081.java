public java.lang.String toString() {
    java.lang.String strFolds = "[";
    for (java.lang.String fold : mFolds) {
        strFolds += (fold.toString()) + "/";
    }
    strFolds += "]";
    return ((((java.lang.Integer.toString(this.hashCode())) + ",") + (java.lang.Double.toString(mEvaluatedScore))) + ",") + strFolds;
}