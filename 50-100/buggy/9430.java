public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String serializedClassifier = "/home/1546/source/stanford-ner-2015-12-09/classifiers/english.all.3class.distsim.crf.ser.gz";
    edu.stanford.nlp.ie.AbstractSequenceClassifier<edu.stanford.nlp.ling.CoreLabel> classifier = CRFClassifier.getClassifier(serializedClassifier);
    source_dir = args[0];
    dest_dir = args[1];
    File[] directories = new File(source_dir).listFiles(File::isDirectory);
    for (File path : directories) {
        java.lang.System.out.print(getAbsolutePath());
        java.lang.System.out.println();
    }
}