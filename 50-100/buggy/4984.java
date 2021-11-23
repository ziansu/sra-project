public void onClick(org.apache.wicket.ajax.AjaxRequestTarget target) {
    target.appendJavaScript("Wicket.Window.unloadConfirmation = false;");
    popup.setInitialHeight(400);
    popup.setInitialWidth(600);
    popup.setTitle(new org.apache.wicket.model.Model<java.lang.String>("Choose layers to associate"));
    popup.setContent(new org.geoserver.community.css.web.MultipleLayerChooser(popup.getContentId(), this));
    popup.show(target);
}