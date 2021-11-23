public static java.lang.String csvToResource(java.util.List<java.lang.String> assessmentFiles, java.lang.String destinationFilepath) throws java.lang.Exception {
    java.util.List<edu.ithaca.dragonlab.ckc.learningobject.LearningObject> fullLoList = new java.util.ArrayList<edu.ithaca.dragonlab.ckc.learningobject.LearningObject>();
    fullLoList = edu.ithaca.dragonlab.ckc.io.CSVReader.learningObjectsFromCSVList(assessmentFiles);
    java.util.List<edu.ithaca.dragonlab.ckc.io.LearningObjectLinkRecord> lolrList = edu.ithaca.dragonlab.ckc.io.LearningObjectLinkRecord.createLearningObjectLinkRecords(fullLoList, 10);
    edu.ithaca.dragonlab.ckc.io.LearningObjectLinkRecord.lolrToJSON(lolrList, destinationFilepath);
    return "Your file has been written to :" + destinationFilepath;
}