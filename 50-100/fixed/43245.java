private java.lang.String getSubTypeContent(java.lang.String response_param_type, cn.ytxu.http_wrapper.model.response.OutputParamModel output, cn.ytxu.http_wrapper.config.property.param_type.ParamTypeEnum subElementType) {
    java.lang.String subElementTypeStr;
    if (subElementType == (cn.ytxu.http_wrapper.config.property.param_type.ParamTypeEnum.OBJECT)) {
        subElementTypeStr = cn.ytxu.http_wrapper.config.property.param_type.ParamTypeEnum.OBJECT.getResponseParamType(response_param_type, output);
    }else {
        subElementTypeStr = cn.ytxu.http_wrapper.config.ConfigWrapper.getParamType().getParamTypeBean(subElementType).getRequestParamType();
    }
    return subElementTypeStr;
}