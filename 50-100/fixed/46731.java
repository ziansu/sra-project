private java.lang.String getExercise(int first, int second) {
    if ((first == 0) && (second == 0)) {
        return "bicep_curl";
    }else
        if ((first == 0) && (second == 1)) {
            return "lat_raise";
        }else
            if ((first == 1) && (second == 1)) {
                return "kick_back";
            }else {
                return "unkown";
            }
        
    
}