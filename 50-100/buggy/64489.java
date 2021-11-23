public void run() {
    java.lang.String msg = "";
    com.sn.work.output.TopTenBst.log.info((("calculating top 10 bst:" + (com.sn.work.output.TopTenBst.evs.getBst10())) + " for opt 1"));
    com.sn.work.output.TopTenBst.res = com.sn.work.output.TopTenBst.evs.getBst10();
    com.sn.work.output.TopTenBst.log.info(("return best top 10 to res for report:" + (com.sn.work.output.TopTenBst.res)));
}