@java.lang.Override
public final com.workplacesystems.queuj.Schedule getSchedule(int run_count) {
    if (run_count < 0)
        return null;
    
    if (run_count >= (number_of_occurrences))
        return null;
    
    return ((com.workplacesystems.queuj.Schedule) (schedules.get(run_count)));
}