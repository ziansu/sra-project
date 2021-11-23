public org.springframework.data.domain.Page<com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard> findAll() {
    java.util.ArrayList<com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard> dashboards = new java.util.ArrayList<>();
    dashboards.add(getSupportDashboardMock(1));
    return new org.springframework.data.domain.PageImpl(dashboards);
}