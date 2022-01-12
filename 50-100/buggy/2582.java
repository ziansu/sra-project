@java.lang.Override
protected void addHyperlinks(java.util.List<org.eclipse.jface.text.hyperlink.IHyperlink> hyperlinksCollector, org.eclipse.jface.text.IRegion wordRegion, org.eclipse.jdt.ui.actions.SelectionDispatchAction openAction, org.eclipse.jdt.core.IJavaElement element, boolean qualify, org.eclipse.jdt.internal.ui.javaeditor.JavaEditor editor) {
    org.eclipse.core.resources.IFile javaFile = org.eclipse.etools.ei18n.util.EI18NUtil.getFile(element);
    for (org.eclipse.etools.ei18n.util.MappingPreference pref : org.eclipse.etools.ei18n.util.MappingPreference.list(javaFile.getProject())) {
        if (pref.getJavaFile().equals(javaFile)) {
            hyperlinksCollector.add(new org.eclipse.etools.ei18n.EI18NHyperlink(wordRegion, openAction, element, qualify));
        }
    }
}