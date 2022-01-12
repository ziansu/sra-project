@java.lang.Override
public void run(org.eclipse.core.runtime.IProgressMonitor arg0) throws org.eclipse.core.runtime.CoreException {
    try {
        if (!(locs.isEmpty())) {
            io.usethesource.vallang.IList results = org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.kernel.get().compile(locs, pathConfig.asConstructor(org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.kernel.get()), org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.kernel.get().kw_compile());
            markErrors(results);
        }
    } catch (java.io.IOException e) {
        throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, org.rascalmpl.eclipse.Activator.PLUGIN_ID, e.getMessage(), e));
    }
}