public int maxAttr(weka.core.Instances data, weka.core.Attribute atr) throws java.lang.Exception {
    int[] maxval = new int[atr.numValues()];
    for (int i = 0; i < (data.numInstances()); i++) {
        weka.core.Instance temp = data.instance(i);
        (maxval[((int) (temp.classValue()))])++;
    }
    return weka.core.Utils.maxIndex(maxval);
}