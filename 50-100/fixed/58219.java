private void renderProperty(tgd.mindless.drone.weatherwidgetnumberone.redux.ThemesClass.Property p) {
    for (tgd.mindless.drone.weatherwidgetnumberone.redux.TimeSegment curSeg : _pos.timeSegments) {
        paint.setColor(p.dot.color);
        _cvs.drawCircle(curSeg.getTemperatureMax().x, curSeg.getTemperatureMax().y, (((p.dot.size) / 100) * (_pos.widget.height)), paint);
    }
}