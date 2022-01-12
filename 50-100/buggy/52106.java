private void drawShadow(android.graphics.Canvas canvas, com.mapbox.mapboxsdk.maps.widgets.UserLocationViewDrawableHolder holder) {
    if (!(holder.hasShadow())) {
        return ;
    }
    canvas.save();
    canvas.concat(mMarkerScreenMatrix);
    canvas.translate(mShadowX, mShadowY);
    boolean willDraw = !(canvas.quickReject(holder.mShadowBounds, Canvas.EdgeType.AA));
    if (willDraw) {
        holder.mShadow.draw(canvas);
    }
    canvas.restore();
}