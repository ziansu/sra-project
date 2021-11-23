@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    initExceptionHandler();
    scanPackegesAndInitRegestry();
    final org.jacpfx.api.launcher.Launcher<org.springframework.context.annotation.AnnotationConfigApplicationContext> launcher = new org.jacpfx.spring.launcher.SpringJavaConfigLauncher(getConfigClasses());
    final java.lang.Class<? extends org.jacpfx.rcp.workbench.FXWorkbench> workbenchHandler = getWorkbenchClass();
    if (workbenchHandler == null)
        throw new org.jacpfx.api.exceptions.ComponentNotFoundException("no FXWorkbench class defined");
    
    initWorkbench(stage, launcher, workbenchHandler);
}