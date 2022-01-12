private de.germeval2017.Evaluation.objectBindings.SentimentAspect getExactMatch(de.germeval2017.Evaluation.objectBindings.SentimentAspect aspect, java.util.List<de.germeval2017.Evaluation.objectBindings.SentimentAspect> aspects_predicted, java.util.List<de.germeval2017.Evaluation.objectBindings.SentimentAspect> processedPredictedAspects) {
    for (de.germeval2017.Evaluation.objectBindings.SentimentAspect aspect_predcited : aspects_predicted) {
        if ((((matchEnd(aspect, aspect_predcited)) && (matchBegin(aspect, aspect_predcited))) && (getCategory(aspect.getAspect()).equals(getCategory(aspect_predcited.getAspect())))) && (!(processedPredictedAspects.contains(aspect_predcited)))) {
            return aspect_predcited;
        }
    }
    return null;
}