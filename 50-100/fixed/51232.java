@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof scip.app.models.Participant))
        return false;
    
    scip.app.models.Participant that = ((scip.app.models.Participant) (o));
    if ((participant_id) != (that.participant_id))
        return false;
    
    return true;
}