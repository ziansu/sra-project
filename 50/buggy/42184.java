public java.lang.String getDetail(java.lang.String name) {
    assert (details) != null : "Did you forget to load the details?";
    return (details) != null ? details.get(name) : null;
}