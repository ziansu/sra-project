@java.lang.Override
public java.lang.String workoutStatisticsInsert(java.lang.String today, java.lang.String userId) throws java.lang.Exception {
    java.lang.System.out.println("workoutStatisticsInsert load");
    java.lang.System.out.println(((("today :" + today) + ",userId : ") + userId));
    java.lang.String workoutStatisticsInsertMsg = "";
    java.util.List<b90ft4.web.repository.vo.WorkoutStatisticsVO> list = wm.retrieveWorkoutStatisticsList(today, userId);
    if ((list.size()) <= 0) {
        wm.insertWorkoutStatisticsList(today, userId);
        workoutStatisticsInsertMsg = "오늘 운동 칼로리 컬럼 추가됨.";
    }else {
        workoutStatisticsInsertMsg = "오늘 운동 칼로리 컬럼 생성 확인.";
    }
    return workoutStatisticsInsertMsg;
}