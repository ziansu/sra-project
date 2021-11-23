private void drawShadow(android.graphics.Canvas canvas, com.mapbox.mapboxsdk.maps.widgets.UserLocationViewDrawableHolder holder) {
    if (!(holder.hasShadow())) {
        return ;
    }
    canvas.save();
    canvas.translate(mShadowX, mShadowY);
    canvas.concat(mMarkerScreenMatrix);
    boolean willDraw = !(canvas.quickReject(holder.mShadowBounds, Canvas.EdgeType.AA));
    if (willDraw) {
        holder.mShadow.draw(canvas);
    }
    canvas.restore();
}