public com.joanfuentes.hintcase.HintCase setShapeAnimators(int offsetResId, com.joanfuentes.hintcase.ShapeAnimator showShapeAnimator, com.joanfuentes.hintcase.ShapeAnimator hideShapeAnimator) {
    int offsetInPx = context.getResources().getDimensionPixelSize(offsetResId);
    this.hintCaseView.setShape(offsetInPx, showShapeAnimator, hideShapeAnimator);
    return this;
}