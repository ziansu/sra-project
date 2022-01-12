@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    it.cnr.missioni.dashboard.component.window.admin.MissioneWindowAdmin.getMissioneWindowAdmin().withBean(selectedMissione).withIsAdmin(true).withEnabled(false).withModifica(true).build();
}