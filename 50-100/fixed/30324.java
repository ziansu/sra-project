private static java.lang.StringBuilder escape(final java.lang.String aValue) {
    if (aValue != null) {
        if (com.bearsoft.citiesfetcher.transforms.CityToCsv.ESCAPED_TEMPLATE.matcher(aValue).matches()) {
            java.lang.StringBuilder escaped = new java.lang.StringBuilder();
            escaped.append('\"').append(com.bearsoft.citiesfetcher.transforms.CityToCsv.QUOTES_TEMPLATE.matcher(aValue).replaceAll("\"\"")).append('\"');
            return escaped;
        }else {
            return new java.lang.StringBuilder(aValue);
        }
    }else {
        return new java.lang.StringBuilder();
    }
}