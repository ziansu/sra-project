public java.lang.String extractProperty(java.lang.String part) {
    java.lang.String candidate = org.springframework.util.StringUtils.uncapitalize(part);
    for (java.lang.String keyword : keywords) {
        if (candidate.endsWith(keyword)) {
            return candidate.substring(0, candidate.lastIndexOf(keyword));
        }
    }
    return candidate;
}