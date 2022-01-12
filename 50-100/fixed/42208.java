public void setPoints(Model.iFencer f, int points) throws Model.ObjectDeprecatedException, java.sql.SQLException {
    if (!(isValid))
        throw new Model.ObjectDeprecatedException();
    
    if ((finished) || (t.isPreliminaryFinished()))
        return ;
    
    Model.Rounds.Round.sync.setPoints(ID, ((Model.Fencer) (f)).getID(), points);
    if (fencer1.equals(f))
        pointsFor1 = points;
    
    if (fencer2.equals(f))
        pointsFor2 = points;
    
}