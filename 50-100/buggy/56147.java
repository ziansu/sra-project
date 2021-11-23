private start.models.Info Do(start.models.Step step) {
    engine.LastFmEngine engine = new engine.LastFmEngine();
    engine.Recommendation r = engine.GetRecommendation(step);
    start.controllers.HomeController.steps.add(r);
    engine.Recommendation result = engine.Merge(start.controllers.HomeController.steps);
    return result.getInfo();
}