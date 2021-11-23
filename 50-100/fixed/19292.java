private boolean rightDirection(remote.controller.ButtonOrder b) {
    if (((b.floor) > (target)) && ((direction) == 1))
        return true;
    else
        if (((b.floor) < (target)) && ((direction) == (-1)))
            return true;
        else
            if ((direction) == 0) {
                return true;
            }
        
    
    return false;
}