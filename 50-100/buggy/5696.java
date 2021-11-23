public java.lang.String get(java.lang.String variable) {
    for (net.arcanesanctuary.Configuration.Conf conf : this.getChildNodes()) {
        if (conf.getVariable().equals(variable)) {
            return conf.getValue();
        }
        if (conf.hasChildNodes()) {
            return get(variable);
        }
    }
    return null;
}