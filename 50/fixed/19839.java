public static void deleteTemp(com.sb.elsinore.Temp tTemp) {
    tTemp.shutdown();
    com.sb.elsinore.LaunchControl.tempList.remove(tTemp);
}