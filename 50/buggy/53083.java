private boolean isAllInfoValid() {
    if (!(isUserNameValid()))
        return false;
    
    if (!(isPasswordValid()))
        return false;
    
    if (isRepeatPasswordValid())
        return false;
    
    return true;
}