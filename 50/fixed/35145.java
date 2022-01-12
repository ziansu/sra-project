private static java.lang.String format(java.lang.Object obj, net.sf.json.JsonConfig jsonConfig, int indentFactor, int indent) {
    return null == obj ? org.apache.commons.lang3.StringUtils.EMPTY : com.feilong.tools.jsonlib.JsonUtil.toJSON(obj, jsonConfig).toString(indentFactor, indent);
}