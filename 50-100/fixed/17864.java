@java.lang.Override
public void initialize(org.apache.uima.UimaContext context) throws org.apache.uima.resource.ResourceInitializationException {
    super.initialize(context);
    items = new java.util.ArrayList<java.lang.String[]>();
    for (java.lang.String line : rawData) {
        java.lang.String[] item = line.split(separator);
        items.add(item);
    }
    currentIndex = 0;
}