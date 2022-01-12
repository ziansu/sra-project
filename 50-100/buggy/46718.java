public java.lang.String getTitanDbname() {
    com.ctrip.framework.apollo.core.enums.Env env = com.ctrip.framework.apollo.core.enums.EnvUtils.transformEnv(com.ctrip.framework.foundation.Foundation.server().getEnvType());
    switch (env) {
        case FAT :
        case FWS :
            return fatTitanDbname;
        case UAT :
            return uatTitanDbname;
        case TOOLS :
        case PRO :
            return proTitanDbname;
        default :
            return "";
    }
}