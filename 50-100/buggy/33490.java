public static void main(java.lang.String[] args) throws java.io.IOException, org.apache.uima.UIMAException, org.apache.uima.resource.ResourceInitializationException {
    java.lang.String corpusLocation = "/home/dominik/Dokumente/BA/CORPORA/";
    boolean islandic = false;
    boolean english = true;
    boolean german = true;
    boolean polnish = true;
    boolean latin = false;
    boolean slovene = true;
    de.unidue.langtech.bachelor.pipelines.CreateBinariesPipeline.writeToBinJCas(corpusLocation, islandic, english, german, polnish, latin, slovene);
}