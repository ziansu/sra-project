public static int getMinSchoolCount(int level) {
    if (level != (com.loocha.exam.bean.UserEntity.LEVEL_FOURTH))
        return com.loocha.exam.process.ResultProcessor.RESULT_MIN_SCHOOL_COUNT;
    
    return com.loocha.exam.process.ResultProcessor.RESULT_MIN_LEVEL_FOURTH_SCHOOL_COUNT;
}