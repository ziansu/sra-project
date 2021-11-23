public void postIteration(net.matthiasauer.stwp4j.ChannelOutPort<net.matthiasauer.stwp4j.libgdx.graphic.InputTouchEventData> outPort) {
    net.matthiasauer.stwp4j.libgdx.graphic.RenderedData touchedRenderedData = null;
    for (net.matthiasauer.stwp4j.libgdx.graphic.InputTouchEventData eventToProcess : this.lastEvents) {
        if (touchedRenderedData == null) {
            touchedRenderedData = this.iterateOverAllEntitiesToFindTouched(eventToProcess);
        }
        eventToProcess.setProjected(touchedRenderedData.getRenderData().isRenderProjected());
        eventToProcess.setTouchedRenderDataId(touchedRenderedData.getRenderData().getId());
        outPort.offer(eventToProcess);
    }
    this.lastEvents.clear();
}