public com.cons.services.ServiceParameter init(java.lang.String url, java.lang.String searchString) {
    com.cons.services.ServiceParameter sp = new com.cons.services.ServiceParameter();
    sp.setId(1);
    sp.setUrl(url);
    sp.setDescription("test");
    sp.setGroup("test2");
    sp.setType("test3");
    sp.setSearchString(searchString);
    return sp;
}