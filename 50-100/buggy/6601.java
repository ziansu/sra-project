private static void releaseColor(int color, int which) {
    switch (which) {
        case com.kmbapps.classscheduler.ClassLoader.DESIRED_CLASSES :
            if (!(com.kmbapps.classscheduler.ClassLoader.availableColors.contains(color))) {
                com.kmbapps.classscheduler.ClassLoader.availableColors.push(color);
            }
            break;
        case com.kmbapps.classscheduler.ClassLoader.CURR_SCHEDULE :
            if (!(com.kmbapps.classscheduler.ClassLoader.currScheduleAvailableColors.contains(color))) {
                com.kmbapps.classscheduler.ClassLoader.currScheduleAvailableColors.push(color);
            }
            break;
    }
}