private static edu.illinois.cs.cogcomp.lbjava.learn.WeightedBatchTrainer prefetchAndGetBatchTrainer(edu.illinois.cs.cogcomp.lbjava.learn.SparseNetworkLearner classifier, edu.illinois.cs.cogcomp.ner.LbjTagger.Data dataSet, java.lang.String exampleStorePath) {
    edu.illinois.cs.cogcomp.ner.LbjTagger.TextChunkRepresentationManager.changeChunkRepresentation(TextChunkRepresentationManager.EncodingScheme.BIO, ParametersForLbjCode.currentParameters.taggingEncodingScheme, dataSet, NEWord.LabelToLookAt.GoldLabel);
    edu.illinois.cs.cogcomp.lbjava.learn.WeightedBatchTrainer bt = new edu.illinois.cs.cogcomp.lbjava.learn.WeightedBatchTrainer(classifier, new edu.illinois.cs.cogcomp.ner.LbjTagger.LORELEIRunner.DataSetReader(dataSet), 50000);
    classifier.setLexicon(bt.preExtract(exampleStorePath));
    edu.illinois.cs.cogcomp.ner.LbjTagger.TextChunkRepresentationManager.changeChunkRepresentation(ParametersForLbjCode.currentParameters.taggingEncodingScheme, TextChunkRepresentationManager.EncodingScheme.BIO, dataSet, NEWord.LabelToLookAt.GoldLabel);
    return bt;
}