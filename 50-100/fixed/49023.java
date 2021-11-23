public void setFinishUpdateFlags(boolean value) {
    if ((news) != null)
        news.isUpToDate = value;
    
    if ((events) != null)
        events.isUpToDate = value;
    
    if ((team) != null)
        team.isUpToDate = value;
    
    if ((competitions) != null)
        competitions.isUpToDate = value;
    
    if ((table) != null)
        table.isUpToDate = value;
    
    if ((galleries) != null)
        galleries.isUpToDate = value;
    
}