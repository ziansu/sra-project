public java.lang.Integer put(final java.lang.String key, final java.lang.Integer value) {
    com.pdpmr.task0.mappers.KScorerMapper.WordStats.WordStatsModel model = modelMap.getOrDefault(key, new com.pdpmr.task0.mappers.KScorerMapper.WordStats.WordStatsModel());
    model = new com.pdpmr.task0.mappers.KScorerMapper.WordStats.WordStatsModel(((model.wordScore) + value), ((model.wordCount) + 1));
    modelMap.put(key, model);
    return model.getMean();
}