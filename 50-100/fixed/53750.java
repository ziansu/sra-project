private double calcAvgError(weka.core.Instances instances) {
    java.util.Enumeration instEnum = instances.enumerateInstances();
    double classification;
    double correctClass = 0;
    while (instEnum.hasMoreElements()) {
        weka.core.Instance currentElement = ((weka.core.Instance) (instEnum.nextElement()));
        classification = classify(currentElement);
        if ((currentElement.classValue()) == classification)
            correctClass++;
        
    } 
    return ((double) (correctClass)) / ((double) (instances.numInstances()));
}