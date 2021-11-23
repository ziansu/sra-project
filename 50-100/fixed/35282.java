private java.util.List<id.base.app.valueobject.Category> getCategoryList() {
    id.base.app.rest.SpecificRestCaller<id.base.app.valueobject.Category> rc = new id.base.app.rest.SpecificRestCaller<id.base.app.valueobject.Category>(id.base.app.rest.RestConstant.REST_SERVICE, id.base.app.rest.RestServiceConstant.CATEGORY_SERVICE);
    return rc.executeGetList(new id.base.app.rest.PathInterfaceRestCaller() {
        @java.lang.Override
        public java.lang.String getPath() {
            return "/findSimpleDataForSelect/{type}";
        }

        @java.lang.Override
        public java.util.Map<java.lang.String, java.lang.Object> getParameters() {
            java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
            map.put("type", SystemConstant.CategoryType.ALL);
            return map;
        }
    });
}