private static weka.core.Instances addLabelsToInstances(weka.core.Instances instances, java.util.List<java.lang.String> labels) {
    if (instances == null)
        return null;
    
    weka.core.Instances inst2 = com.github.TKnudsen.ComplexDataObject.model.tools.WekaConversion.addLabelAttributeToInstance(instances, labels);
    for (int i = 0; i < (labels.size()); i++)
        inst2.instance(i).setClassValue(labels.get(i));
    
    return inst2;
}