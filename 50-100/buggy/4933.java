public void setParameters(final uk.ac.diamond.scisoft.analysis.rcp.inspector.SliceProperty property, final uk.ac.diamond.scisoft.analysis.dataset.ILazyDataset axis, final uk.ac.diamond.scisoft.analysis.rcp.inspector.SliceProperty[] properties, boolean used) {
    slice = property;
    if ((axisSlices) != null)
        for (int i = 0; i < (axisSlices.length); i++)
            axisSlices[i].removePropertyChangeListener(listener);
        
    
    axisSlices = properties;
    mode = used;
    axisData = axis;
    createAxisDataset();
    init(false);
}