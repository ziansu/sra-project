@java.lang.Override
public com.krishagni.catissueplus.core.dashboard.domain.Dashboard createDashboard(com.krishagni.catissueplus.core.dashboard.domain.Dashboard existing, com.krishagni.catissueplus.core.dashboard.events.DashboardDetail detail) {
    com.krishagni.catissueplus.core.common.errors.OpenSpecimenException ose = new com.krishagni.catissueplus.core.common.errors.OpenSpecimenException(com.krishagni.catissueplus.core.common.errors.ErrorType.USER_ERROR);
    com.krishagni.catissueplus.core.dashboard.domain.Dashboard dashboard = new com.krishagni.catissueplus.core.dashboard.domain.Dashboard();
    if (existing != null) {
        dashboard.setId(existing.getId());
    }
    setUser(detail, existing, dashboard, ose);
    setDashlets(detail, existing, dashboard, ose);
    setActivityStatus(detail, existing, dashboard, ose);
    ose.checkAndThrow();
    return dashboard;
}