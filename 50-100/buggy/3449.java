public void addlabelCount(java.lang.String labelName) {
    label_string = labelName;
    if (!(learn.FeatureVector.labelMap.containsKey(labelName))) {
        learn.FeatureVector.labelMap.put(labelName, ((learn.FeatureVector.labelCount)++));
        label = learn.FeatureVector.labelCount;
    }
    label = learn.FeatureVector.labelMap.get(labelName);
}