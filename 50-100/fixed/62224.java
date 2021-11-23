public float score(float[] featureVector) {
    if (isLeaf()) {
        return value;
    }
    if ((((featureIndex) < 0) || ((featureIndex) >= (featureVector.length))) || ((featureVector[featureIndex]) <= (threshold))) {
        return left.score(featureVector);
    }
    return right.score(featureVector);
}