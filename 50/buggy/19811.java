public void cleanTopKTravelScheduleInMemory() {
    java.lang.System.out.println("hello");
    redisDao.cleanTopKMarkedTravelScheduleInMemory(Constant.TOP_K_TRAVEL_SCHEDULE);
    redisDao.cleanTopKVisitedTravelScheduleInMemory(Constant.TOP_K_TRAVEL_SCHEDULE);
}