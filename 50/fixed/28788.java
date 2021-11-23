@java.lang.Override
public net.sf.mzmine.parameters.parametertypes.selectors.PeakListsParameter cloneParameter() {
    net.sf.mzmine.parameters.parametertypes.selectors.PeakListsParameter copy = new net.sf.mzmine.parameters.parametertypes.selectors.PeakListsParameter(name, minCount, maxCount);
    if ((value) != null)
        copy.value = value.clone();
    
    return copy;
}