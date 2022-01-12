private static void printResult(java.util.Map<java.lang.String, com.xiaomi.infra.galaxy.sds.thrift.Datum> resultToPrint) {
    for (java.util.Map.Entry<java.lang.String, com.xiaomi.infra.galaxy.sds.thrift.Datum> e : resultToPrint.entrySet()) {
        java.lang.System.out.println(java.lang.String.format("[%s] => %s", e.getKey(), com.xiaomi.infra.galaxy.sds.thrift.DatumUtil.fromDatum(e.getValue()).toString()));
    }
}