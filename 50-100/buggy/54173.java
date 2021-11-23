@java.lang.Override
public void run(org.eclipse.core.runtime.IProgressMonitor arg0) throws org.eclipse.core.runtime.CoreException {
    try {
        if (!(locs.isEmpty())) {
            synchronized(org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.kernel) {
                io.usethesource.vallang.IList results = org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.kernel.compile(locs, pathConfig.asConstructor(org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.kernel), org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.kernel.kw_compile());
                markErrors(results);
            }
        }
    } catch (java.io.IOException e) {
        throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, org.rascalmpl.eclipse.Activator.PLUGIN_ID, e.getMessage(), e));
    }
}