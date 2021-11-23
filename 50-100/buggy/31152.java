private void appendDependencies(java.lang.StringBuilder deps, pt.webdetails.cpf.packager.DependenciesPackage pkg, boolean minify, java.lang.String absRoot, final java.util.ArrayList<java.lang.String> files) {
    if (absRoot != null) {
        pt.webdetails.cpf.packager.StringFilter filter = new org.pentaho.cdf.packager.CdfHeadersProvider.AbsolutizingStringFilter(absRoot, pkg.getDefaultFilter());
        deps.append(pkg.getDependencies(filter, minify, new org.pentaho.cdf.packager.CdfHeadersProvider.CdfDependencyInclusionFilter(files)));
    }else {
        deps.append(pkg.getDependencies(minify, new org.pentaho.cdf.packager.CdfHeadersProvider.CdfDependencyInclusionFilter(files)));
    }
}