@java.lang.Override
public void run() {
    li.allan.stat.StopWatch stopWatch = li.allan.stat.StopWatch.start("cn");
    stopWatch.stop(CacheUseStatus.USE_CACHE);
    li.allan.stat.Statistics.printLog();
    li.allan.stat.Statistics.roll();
}