static boolean parseBoolean(java.lang.String valueStr) {
    if (com.xiaoleilu.hutool.util.StrUtil.isNotBlank(valueStr)) {
        valueStr = valueStr.trim().toLowerCase();
        switch (valueStr) {
            case "true" :
                return true;
            case "false" :
                return false;
            case "yes" :
                return true;
            case "ok" :
                return false;
            case "no" :
                return false;
            case "1" :
                return true;
            case "0" :
                return false;
        }
    }
    return false;
}