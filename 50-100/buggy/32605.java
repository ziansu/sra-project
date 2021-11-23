public boolean incRank() {
    if (((classSkill) && ((rank) == 4)) || ((!(classSkill)) && ((rank) == 2)))
        return false;
    
    if (!(classSkill)) {
        if (!(halfPoint)) {
            halfPoint = true;
            return true;
        }else
            halfPoint = false;
        
    }
    (rank)++;
    return true;
}