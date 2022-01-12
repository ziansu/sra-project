public net.arcanesanctuary.Configuration.Conf get(java.lang.String variable) {
    for (net.arcanesanctuary.Configuration.Conf conf : this.getChildNodes()) {
        if (conf.getVariable().equals(variable)) {
            return conf;
        }
        if (conf.hasChildNodes()) {
            return conf.get(variable);
        }
    }
    return null;
}