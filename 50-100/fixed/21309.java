public int compare(com.zhangzhangzhang.daydayup.performance.StockPerformance o1, com.zhangzhangzhang.daydayup.performance.StockPerformance o2) {
    if (o1.getDate().before(o2.getDate())) {
        return -1;
    }else
        if (o2.getDate().before(o1.getDate())) {
            return 1;
        }
    
    return 0;
}