public static java.lang.String getFreeFunction(final com.spectralogic.ds3autogen.c.models.StructMember structMember) throws java.text.ParseException {
    switch (structMember.getType()) {
        case "ds3_str*" :
            return "ds3_str_free";
        case "uint64_t" :
        case "double" :
            return "";
        case "long" :
            return "";
        case "int" :
            return "";
        case "ds3_bool" :
            return "";
        case "java.util.Set" :
        case "array" :
        default :
            return com.spectralogic.ds3autogen.c.helpers.StructHelper.getFreeFunctionName(structMember.getType());
    }
}