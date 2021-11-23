public java.lang.String getAdUnitId() {
    long id = adUnit.getId();
    return id > 0 ? id + "" : "";
}