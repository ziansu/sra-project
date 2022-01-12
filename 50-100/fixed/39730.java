private boolean touchesVisiblePartOfTarget(com.badlogic.ashley.core.Entity targetEntity, net.matthiasauer.abocr.graphics.RenderComponent renderComponent, net.matthiasauer.abocr.graphics.RenderedComponent renderedComponent) {
    net.matthiasauer.abocr.input.InputTouchTargetComponent targetComponent = this.targetComponentMapper.get(targetEntity);
    if (renderedComponent.renderedTarget.contains(this.lastEvent.unprojectedPosition)) {
        if ((renderComponent.texture) == null) {
            throw new java.lang.NullPointerException("targetComponent.texture was null !");
        }
        if (this.isClickedPixelInvisible(renderedComponent, renderComponent, targetComponent)) {
            return true;
        }
    }
    return false;
}