public static boolean have_conflict(ucsbCurriculum.Utility.Time t1, ucsbCurriculum.Utility.Time t2) {
    return (t1.start_time) > (t2.start_time) ? (t1.start_time) > (t2.end_time) : (t2.start_time) > (t1.start_time);
}