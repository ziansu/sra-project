private static void output() {
    for (int i = 0; i < (site.xiaodong.wechat.Bill.sumList.size()); ++i) {
        if ((java.lang.Double.parseDouble(site.xiaodong.wechat.Bill.sumList.get(i).toString())) > 0) {
            java.lang.System.out.println((((site.xiaodong.wechat.Bill.nameList.get(i)) + "\t") + (site.xiaodong.wechat.Bill.sumList.get(i))));
        }
    }
    if (site.xiaodong.wechat.Bill.someoneDeleted)
        java.lang.System.out.println("someone deleted may not be process, you can run with -d to include it.");
    
}