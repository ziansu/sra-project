public java.lang.String getScheduler() {
    if (cn.momia.common.util.TimeUtil.isSameDay(startTime, endTime)) {
        return (((cn.momia.api.course.dto.CourseSku.MONTH_DATE_FORMAT.format(startTime)) + (cn.momia.api.course.dto.CourseSku.TIME_FORMAT.format(startTime))) + " - ") + (cn.momia.api.course.dto.CourseSku.TIME_FORMAT.format(endTime));
    }else {
        return ((cn.momia.api.course.dto.CourseSku.MONTH_DATE_FORMAT.format(startTime)) + " - ") + (cn.momia.api.course.dto.CourseSku.MONTH_DATE_FORMAT.format(endTime));
    }
}