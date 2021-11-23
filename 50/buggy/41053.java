public org.springframework.ide.eclipse.boot.dash.model.BootDashElement apply(org.eclipse.debug.core.ILaunchConfiguration input) {
    return childFactory.createOrGet(getBootDashModel(), input);
}