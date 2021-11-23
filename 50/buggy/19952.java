public gov.nasa.jpf.constraints.api.Expression parse() {
    parseLet();
    return parseTerm();
}