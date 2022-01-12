public boolean apply(org.eclipse.emf.common.util.URI input) {
    if (input != null) {
        final org.eclipse.core.resources.IFile pointedFile = org.eclipse.emf.compare.ide.ui.internal.logical.resolver.ResolutionUtil.getFileAt(input);
        if (pointedFile != null) {
            return container.getLocation().isPrefixOf(pointedFile.getLocation());
        }
    }
    return false;
}