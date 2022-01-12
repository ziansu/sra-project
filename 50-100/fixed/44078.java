@java.lang.Override
public void onStartup(javax.servlet.ServletContext sc) throws javax.servlet.ServletException {
    sc.setInitParameter(ProjectStage.PROJECT_STAGE_PARAM_NAME, ProjectStage.Development.toString());
    sc.setInitParameter(ViewHandler.FACELETS_SKIP_COMMENTS_PARAM_NAME, java.lang.Boolean.TRUE.toString());
    sc.setInitParameter(Converter.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE_PARAM_NAME, java.lang.Boolean.TRUE.toString());
    sc.setInitParameter("com.sun.faces.forceLoadConfiguration", java.lang.Boolean.TRUE.toString());
    sc.setInitParameter(ContextParams.THEME, themeSwitcherBean.getTheme().getKey());
}