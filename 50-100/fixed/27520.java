public java.util.Date getEndTime() {
    java.util.Date now = new java.util.Date();
    java.util.List<java.util.Date> endTimes = new java.util.ArrayList<java.util.Date>();
    for (cn.momia.service.course.base.CourseSku sku : skus) {
        if (sku.isAvaliable(now))
            endTimes.add(sku.getEndTime());
        
    }
    java.util.Collections.sort(endTimes);
    return endTimes.isEmpty() ? null : endTimes.get(((endTimes.size()) - 1));
}