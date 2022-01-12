private cruise.umple.compiler.UmpleModel getRunModel(java.lang.String inCode) {
    cruise.umple.util.SampleFileWriter.createFile("traitTest.ump", inCode);
    cruise.umple.compiler.UmpleFile uFile = new cruise.umple.compiler.UmpleFile("traitTest.ump");
    uMode = new cruise.umple.compiler.UmpleModel(uFile);
    try {
        uMode.run();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        cruise.umple.util.SampleFileWriter.destroy("traitTest.ump");
        cruise.umple.util.SampleFileWriter.destroy("A.java");
    }
    return uMode;
}