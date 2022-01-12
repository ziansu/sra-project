private void appendDependencies(java.lang.StringBuilder deps, pt.webdetails.cpf.packager.DependenciesPackage pkg, boolean minify, java.lang.String absRoot) {
    if (absRoot != null) {
        pt.webdetails.cpf.packager.StringFilter filter = new org.pentaho.cdf.packager.CdfHeadersProvider.AbsolutizingStringFilter(absRoot, pkg.getDefaultFilter());
        deps.append(pkg.getDependencies(filter, minify));
    }else {
        deps.append(pkg.getDependencies(minify));
    }
}