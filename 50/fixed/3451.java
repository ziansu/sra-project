private java.lang.String getCepWithoutTrace() {
    if ((cep) != null) {
        return cep.replace("-", "").trim();
    }
    return null;
}