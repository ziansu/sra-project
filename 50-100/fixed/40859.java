public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String serializedClassifier = "/home/1546/source/stanford-ner-2015-12-09/classifiers/english.all.3class.distsim.crf.ser.gz";
    java.lang.String source_dir = args[0];
    java.lang.String dest_dir = args[1];
    java.io.File[] directories = new java.io.File(source_dir).listFiles(java.io.File::isDirectory);
    for (java.io.File path : directories) {
        java.lang.System.out.print(path.getAbsolutePath());
        java.lang.System.out.println();
    }
}