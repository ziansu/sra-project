public boolean getAcc() {
    if (((actualClass) == "Spam") && ((spamProbability) >= 0.5))
        return true;
    else
        if (((actualClass) == "Ham") && ((spamProbability) <= 0.5))
            return true;
        else
            return false;
        
    
}