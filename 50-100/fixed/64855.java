public static void main(java.lang.String[] args) {
    java.lang.String file_events = args[0];
    java.lang.String file_content = args[1];
    data.CascadeData data = new data.CascadeData(file_events, file_content);
    data.getInfo();
    survivalFactorization.GibbsSampler sampler = new survivalFactorization.GibbsSampler(survivalFactorization.SamplerSettings.getDefaultSettings());
    sampler.runInference(data, 5);
}