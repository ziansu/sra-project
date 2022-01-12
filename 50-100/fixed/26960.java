public static org.eclipse.jface.text.IRegion[] findByName(org.eclipse.cdt.core.dom.ast.IASTTranslationUnit root, org.eclipse.cdt.core.dom.ast.IASTName name) {
    org.eclipse.cdt.core.dom.ast.IBinding target = name.resolveBinding();
    if (target == null) {
        return org.eclipse.cdt.internal.ui.search.LinkedNamesFinder.EMPTY_LOCATIONS_ARRAY;
    }
    org.eclipse.cdt.internal.ui.search.LinkedNamesFinder.BindingFinder bindingFinder = new org.eclipse.cdt.internal.ui.search.LinkedNamesFinder.BindingFinder(root, name);
    bindingFinder.find(target);
    return bindingFinder.getLocations();
}