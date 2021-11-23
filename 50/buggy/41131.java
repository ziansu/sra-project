public org.wicketstuff.openlayers3.api.overlay.Popover show(org.apache.wicket.ajax.AjaxRequestTarget target) {
    target.appendJavaScript(renderPopoverJs());
    hide(target);
    target.appendJavaScript((("$(" + (getJsId())) + ".getElement()).popover('show');"));
    return this;
}