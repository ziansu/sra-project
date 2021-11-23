public boolean partialAssignment(java.lang.Class weeklyClass) {
    if (assignIgnoringQualifications(weeklyClass)) {
        return true;
    }else
        if (assignPartialHours(weeklyClass)) {
            return true;
        }else
            if (assignIgnoringQualificationsAndTimes(weeklyClass)) {
                return true;
            }
        
    
    return false;
}