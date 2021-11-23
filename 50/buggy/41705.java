@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    de.hdm.itprojekt.noteit.client.Homepage homepage = new de.hdm.itprojekt.noteit.client.Homepage();
    Homepage.contentPanel.remove(1);
    Homepage.contentPanel.setHeight("300px");
    Homepage.contentPanel.setWidth("500px");
}