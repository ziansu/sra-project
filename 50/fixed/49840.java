public void setEventMap(com.ykrapiva.eventmap.EventMap<T> world) {
    mEventMap = world;
    mRenderer.setEventMap(mEventMap);
    com.ykrapiva.eventmap.EventMapView.requestRender();
}