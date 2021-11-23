public static boolean getFixQualEnc(org.apache.hadoop.conf.Configuration conf) {
    return conf.getBoolean(be.ugent.intec.halvade.utils.HalvadeConf.fixQualEnc, false);
}