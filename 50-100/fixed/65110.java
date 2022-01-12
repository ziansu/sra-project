@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if (obj == null)
        return false;
    
    if (!(obj instanceof com.hartwig.hmftools.breakpointinspector.Util.Location))
        return false;
    
    com.hartwig.hmftools.breakpointinspector.Util.Location other = ((com.hartwig.hmftools.breakpointinspector.Util.Location) (obj));
    return ((ReferenceIndex) == (other.ReferenceIndex)) && ((Position) == (other.Position));
}