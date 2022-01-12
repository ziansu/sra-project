public java.util.Date getStartTime() {
    java.util.Date now = new java.util.Date();
    java.util.List<java.util.Date> startTimes = new java.util.ArrayList<java.util.Date>();
    for (cn.momia.service.course.base.CourseSku sku : skus) {
        if (sku.isAvaliable(now))
            startTimes.add(sku.getStartTime());
        
    }
    java.util.Collections.sort(startTimes);
    return startTimes.isEmpty() ? null : startTimes.get(0);
}