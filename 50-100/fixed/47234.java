public static int getGradleLevel(int num) {
    int result = 1;
    com.semc.aqi.model.GradeInfo gradeInfo = com.semc.aqi.config.Global.getGradeInfo();
    for (int i = 0; i < (gradeInfo.size()); i++) {
        if (num <= (gradeInfo.get(i).getAQIMax())) {
            result = i + 1;
            break;
        }else {
            continue;
        }
    }
    return result;
}