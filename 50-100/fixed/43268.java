@java.lang.Override
public com.intellij.psi.PsiMethod getSetter() {
    java.lang.String name = getName();
    cz.mikrobestie.idea.vaadin.declarative.psi.VDComponent component = getComponent();
    if ((name != null) && (component != null)) {
        java.lang.String className = component.getComponentClassName();
        if (className != null) {
            java.lang.String setterName = cz.mikrobestie.idea.vaadin.declarative.VaadinUtils.capitalizeSetter(name);
            return cz.mikrobestie.idea.vaadin.declarative.PluginUtils.findClassSetter(getProject(), className, setterName);
        }
    }
    return null;
}