private void addSequence(int seqId, char base) {
    if (this.seqChars.isEmpty())
        this.base = base;
    
    for (java.lang.Integer sqId : seqChars.keySet())
        if (sqId == seqId)
            return ;
        
    
    this.seqChars.put(seqId, base);
}