public boolean checkData(int HDice, int HRoll, int DDice, int DRoll, int DDealt) {
    if ((HRoll < HDice) || (HRoll > (HDice * (MAX_DIE_ROLL))))
        return false;
    
    if ((DRoll < DDice) || (DRoll > (DDice * (MAX_DIE_ROLL))))
        return false;
    
    if (DDealt > DRoll)
        return false;
    
    return true;
}