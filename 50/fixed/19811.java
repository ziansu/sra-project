public void cleanTopKTravelScheduleInMemory() {
    redisDao.cleanTopKMarkedTravelScheduleInMemory(Constant.TOP_K_TRAVEL_SCHEDULE);
    redisDao.cleanTopKVisitedTravelScheduleInMemory(Constant.TOP_K_TRAVEL_SCHEDULE);
}