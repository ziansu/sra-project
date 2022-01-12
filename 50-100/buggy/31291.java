public void onRequestExtractions() {
    java.util.ArrayList<java.util.ArrayList<semgen.stage.serialization.ExtractionNode>> extractions = new java.util.ArrayList<java.util.ArrayList<semgen.stage.serialization.ExtractionNode>>();
    for (semgen.stage.stagetasks.extractor.ModelExtractionGroup meg : extractnodeworkbenchmap) {
        if (meg != null) {
            extractions.add(meg.getExtractionArray());
        }
    }
    _commandSender.loadExtractions(extractions);
}