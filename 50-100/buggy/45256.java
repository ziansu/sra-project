private float generateHorizontalPivot() {
    switch (getViewPosition()) {
        case Transformer.LEFT :
            return getMarginLeft();
        case Transformer.CENTER :
            return (getView().getWidth()) / 2;
        case Transformer.RIGHT :
            return (getView().getWidth()) - (getMarginRight());
        default :
            return (getView().getWidth()) - (getMarginRight());
    }
}