public int[] advance_next_course_indexes(int which_index_to_advance, Course c) {
    int day = c.Day;
    int hour = c.Hour;
    int teacher_ = c.teacher;
    switch (which_index_to_advance) {
        case 2 :
            teacher_++;
            break;
        case 1 :
            teacher_ = 0;
            hour++;
            break;
        case 0 :
            teacher_ = 0;
            hour = 0;
            day++;
            break;
    }
    return new int[]{ c.course_index , day , hour , teacher_ };
}