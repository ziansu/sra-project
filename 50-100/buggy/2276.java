@org.processmining.contexts.uitopia.annotations.UITopiaVariant(affiliation = "FBK", author = "R. De Masellis et al.", email = "r.demasellis|dfmchiara@fbk.eu")
@org.processmining.framework.plugin.annotations.PluginVariant(variantLabel = "FuzzyPNMiner, parameters", requiredParameterLabels = { 0 })
public java.lang.Object[] defaultFCGMinerPlugin(org.processmining.framework.plugin.PluginContext context, org.deckfour.xes.model.XLog log) {
    org.deckfour.xes.classification.XEventClassifier nameCl = new org.deckfour.xes.classification.XEventNameClassifier();
    org.processmining.plugins.heuristicsnet.miner.heuristics.miner.settings.HeuristicsMinerSettings hMS = new org.processmining.plugins.heuristicsnet.miner.heuristics.miner.settings.HeuristicsMinerSettings();
    hMS.setClassifier(nameCl);
    org.processmining.plugins.fuzzyminer.FuzzyMinerSettings settings = new org.processmining.plugins.fuzzyminer.FuzzyMinerSettings(hMS, 0.8, 0.5, 0.3);
    return privateFPNMinerPlugin(context, log, settings);
}