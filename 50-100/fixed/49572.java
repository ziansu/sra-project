public boolean is_available(int day, int hour, int course_length) {
    if ((hour + course_length) >= (HOURS))
        return false;
    
    for (int i = 0; i < course_length; i++) {
        if ((schedule[day][(hour + i)]) == true)
            return false;
        
    }
    return true;
}