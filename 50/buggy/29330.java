void parseQueryParameters() {
    int queryEnd = ((fragment) == (-1)) ? raw.length() : fragment;
    queryPositions = io.datakernel.http.HttpUrl.doParseParameters(raw, query, queryEnd);
}