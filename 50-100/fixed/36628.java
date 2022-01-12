public static com.yunxi.common.lang.enums.CommonYN get(java.lang.String e) {
    if (((com.yunxi.common.lang.enums.CommonYN.Y.name().equalsIgnoreCase(e)) || ("YES".equalsIgnoreCase(e))) || ("TRUE".equalsIgnoreCase(e))) {
        return com.yunxi.common.lang.enums.CommonYN.Y;
    }
    if (((com.yunxi.common.lang.enums.CommonYN.N.name().equalsIgnoreCase(e)) || ("NO".equalsIgnoreCase(e))) || ("FALSE".equalsIgnoreCase(e))) {
        return com.yunxi.common.lang.enums.CommonYN.N;
    }
    return com.yunxi.common.lang.enums.CommonYN.N;
}