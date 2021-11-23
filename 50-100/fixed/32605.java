public boolean incRank() {
    if (((classSkill) && ((rank) == 4)) || ((!(classSkill)) && ((rank) == 2)))
        return false;
    
    (rank)++;
    return true;
}