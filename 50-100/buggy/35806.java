public java.util.List<Resource> getResources(java.lang.String keyword) {
    if (keyword == null) {
        throw new java.lang.NullPointerException();
    }
    if (keyword.equals("")) {
        throw new java.lang.IllegalArgumentException();
    }
    if (index.containsKey(keyword)) {
        return index.get(keyword);
    }else {
        return null;
    }
}