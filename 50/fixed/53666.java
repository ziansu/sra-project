@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if (obj == null)
        return false;
    
    return com.google.common.base.Objects.equal(this.name, ((org.mapfish.print.processor.ProcessorDependencyGraphFactory.InputValue) (obj)).name);
}