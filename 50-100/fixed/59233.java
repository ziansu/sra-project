@java.lang.Override
public void setVisible(boolean visible) {
    super.setVisible(visible);
    java.util.Date oneyear = new java.util.Date();
    com.google.gwt.user.datepicker.client.CalendarUtil.addMonthsToDate(oneyear, 12);
    com.google.gwt.user.client.Cookies.setCookie("emarking_showrubric", (visible ? "1" : "0"), oneyear);
    cl.uai.client.EMarkingConfiguration.setShowRubricOnLoad(visible);
    EMarkingWeb.markingInterface.getMarkingPagesInterface().loadInterface();
    EMarkingWeb.markingInterface.setShowRubricButtonVisible(visible);
}