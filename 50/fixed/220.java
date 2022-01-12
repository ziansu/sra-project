public void setTransformation(com.remind101.android.views.TokenBackgroundSpan.TextDisplayTransformation transformation) {
    if (transformation != (this.transformation)) {
        this.transformation = transformation;
        setCachedDisplayText(null, 0, 0, null);
    }
}