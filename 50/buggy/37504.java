public boolean checkCondition() {
    if (goalPosition.compareTo(person.getPosition()))
        return true;
    else
        return false;
    
}