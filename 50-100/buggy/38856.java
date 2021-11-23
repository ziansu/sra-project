public static com.anji.integration.Activator doEvolution(dk.itu.jglyph.user.Model model, com.anji.util.Properties properties) {
    TrainingSet.model = model;
    com.anji.integration.Activator result = null;
    try {
        com.anji.neat.Evolver evolver = new com.anji.neat.Evolver();
        evolver.init(properties);
        evolver.run();
        com.anji.integration.ActivatorTranscriber transcriber = ((com.anji.integration.ActivatorTranscriber) (properties.newObjectProperty(dk.itu.jglyph.neat.NeatUtil.TRANSCRIBER_CLASS_KEY)));
        result = transcriber.newActivator(evolver.getChamp());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return result;
}