private com.google.gson.JsonArray constructColumnHeaders(java.lang.Iterable<uk.ac.ebi.atlas.model.differential.Contrast> contrasts, uk.ac.ebi.atlas.model.differential.DifferentialExperiment differentialExperiment) {
    com.google.gson.JsonArray result = new com.google.gson.JsonArray();
    for (uk.ac.ebi.atlas.model.differential.Contrast contrast : contrasts) {
        com.google.gson.JsonObject o = contrast.toJson();
        o.add("contrastSummary", new uk.ac.ebi.atlas.experimentpage.tooltip.ContrastSummaryBuilder().forContrast(contrast).withExperimentDesign(differentialExperiment.getExperimentDesign()).withExperimentDescription(differentialExperiment.getDescription()).build().toJson());
    }
    return result;
}