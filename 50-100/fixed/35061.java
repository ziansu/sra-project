private java.util.Set<rocks.inspectit.shared.all.communication.data.ParameterContentData> convertParameterContents() {
    java.util.Set<rocks.inspectit.shared.all.communication.data.ParameterContentData> contents = new java.util.HashSet<>();
    if ((parameterContentData) != null) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> contentEntry : parameterContentData.entrySet()) {
            contents.add(convertParamEntry(contentEntry));
        }
    }
    return contents;
}