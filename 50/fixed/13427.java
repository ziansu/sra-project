public void addInterest(com.burgames.finder.domain.Interest interest) {
    if (interest == null)
        throw new java.lang.IllegalArgumentException("Interest must not be null");
    
    if ((interests.size()) > 16)
        throw new java.lang.IllegalArgumentException("To many interests");
    
    interests.add(interest);
}