public float binaryLogistic(int target, boolean label, float lr) {
    float score = sigmoid(wo_.dotRow(hidden_, target));
    float alpha = lr * (label ? 1.0F : 0.0F - score);
    grad_.addRow(wo_, target, alpha);
    wo_.addRow(hidden_, target, alpha);
    if (label) {
        return -(log(score));
    }else {
        return -(log((1.0F - score)));
    }
}