@com.google.gwt.uibinder.client.UiHandler(value = "closeIpadBtn")
public void onIpadCloseClick(com.google.gwt.event.dom.client.ClickEvent clickEvent) {
    ipadSectiondiv.setVisible(false);
    androidSectiondiv.setVisible(false);
    org.ednovo.gooru.shared.util.StringUtil.IPAD_MESSAGE_Close_Click = true;
    org.ednovo.gooru.client.mvp.play.collection.body.CollectionPlayerMetadataView.onClosingAndriodorIpaddiv();
    org.ednovo.gooru.client.mvp.play.resource.body.ResourcePlayerMetadataView.onClosingAndriodorIpaddiv();
}