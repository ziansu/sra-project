public java.util.Map<aprs.framework.database.DbParamTypeEnum, java.lang.Integer> getParamPosMap() {
    if ((null == (paramPosMap)) && (null != (params))) {
        paramPosMap = new java.util.EnumMap(aprs.framework.database.DbParamTypeEnum.class);
        for (int i = 0; i < (params.length); i++) {
            paramPosMap.put(params[i], (i + 1));
        }
    }
    return paramPosMap;
}