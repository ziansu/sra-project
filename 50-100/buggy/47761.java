public synchronized org.springframework.ide.eclipse.boot.dash.model.BootDashElement createOrGet(org.eclipse.core.resources.IProject p) {
    if (org.springframework.ide.eclipse.boot.core.BootPropertyTester.isBootProject(p)) {
        org.springframework.ide.eclipse.boot.dash.model.BootProjectDashElement el = cache.get(p);
        if (el == null) {
            cache.put(p, (el = new org.springframework.ide.eclipse.boot.dash.model.BootProjectDashElement(p, model, projectProperties)));
        }
        return el;
    }
    return null;
}