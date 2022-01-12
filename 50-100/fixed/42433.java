@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    preFilter.ShowSTandardsPanel().clear();
    getAddStandards();
    preFilter.ShowSTandardsPanel().add(addStandardsPresenter.getWidget());
    addStandardsPresenter.getAddBtn().setVisible(false);
    headerUc.setAddStandardsPresenter(addStandardsPresenter, true);
}