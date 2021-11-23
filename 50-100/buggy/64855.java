public static void main(java.lang.String[] args) {
    java.lang.String file_events = "/Users/barbieri/Dropbox/shared ICAR/SurvivalFactorization/exp/meme_tracker/debug/cleaned_debug_activations";
    java.lang.String file_content = "/Users/barbieri/Dropbox/shared ICAR/SurvivalFactorization/exp/meme_tracker/debug/cleaned_debug_content";
    data.CascadeData data = new data.CascadeData(file_events, file_content);
    data.getInfo();
    survivalFactorization.GibbsSampler sampler = new survivalFactorization.GibbsSampler(survivalFactorization.SamplerSettings.getDefaultSettings());
    sampler.runInference(data, 5);
}