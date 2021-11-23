public void setMatchIndexByID(int ID, int index) {
    assert (matchIndex[ID]) <= index;
    assert (matchIndex[ID]) < (nextIndex[ID]);
    if ((role.getLog(index).getTerm()) == (role.ID)) {
        matchIndex[ID] = index;
    }else
        return ;
    
}