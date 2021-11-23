public void setOtherThanPreferredRoutesPenalty(int penalty) {
    if (penalty < 0)
        penalty = 0;
    
    this.otherThanPreferredRoutesPenalty = penalty;
}