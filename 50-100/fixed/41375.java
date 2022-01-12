@org.testng.annotations.Test(groups = { "UITest" })
public void TC_05_testVerifyPastAppointmentListVisibility() {
    java.lang.System.out.println("Verify that Past Appointment List is visible on Past Appointment Screen");
    dashboardpage.onTapDashboardtext();
    com.qa.mobileapp.common.GlobalUtil.wait(2);
    dashboardpage.onTapMyTasksExpandButton();
    com.qa.mobileapp.common.GlobalUtil.wait(2);
    dashboardpage.onTapAppointmentsNav();
    com.qa.mobileapp.common.GlobalUtil.wait(2);
    appointmentpage.onClickPastTab();
    com.qa.mobileapp.common.GlobalUtil.wait(2);
    if ((appointmentpage.getAppointmentScreenPatientNameLocator()) != null) {
        junit.framework.Assert.assertNotNull(appointmentpage.getAppointmentListViewPageLocator());
    }else {
        java.lang.System.out.println("Not found any Past Appoinment");
    }
}