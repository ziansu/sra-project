public boolean getAcc() {
    if ((actualClass.equals("Spam")) && ((spamProbability) >= 0.5))
        return true;
    else
        if ((actualClass.equals("Ham")) && ((spamProbability) < 0.5))
            return true;
        else
            return false;
        
    
}