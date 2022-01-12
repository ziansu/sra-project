public gov.nasa.jpf.constraints.api.Expression parse() {
    parseLet();
    gov.nasa.jpf.constraints.api.Expression result = parseTerm();
    return result;
}