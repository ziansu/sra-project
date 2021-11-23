@java.lang.Override
public boolean deletePlayArea(java.lang.String name) {
    if (!(containsPlayAreaByName(name)))
        return false;
    
    try {
        db.delete(copyPlayArea(getPlayArea(name), false));
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}