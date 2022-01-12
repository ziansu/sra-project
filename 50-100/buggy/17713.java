public void initPrefixes(edu.mayo.twinkql.model.TwinkqlConfig config) {
    if (config == null) {
        return ;
    }
    if ((config.getTwinkqlConfigItem()) != null) {
        for (edu.mayo.twinkql.model.TwinkqlConfigItem item : config.getTwinkqlConfigItem()) {
            if ((item.getNamespace()) != null) {
                this.prefixes.add(this.buildPrefix(item.getNamespace()));
            }
        }
    }
}