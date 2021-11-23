public java.lang.String checkHungerStatus(model.Person person) {
    final int currentHealth = person.getHealth().getCurrent();
    if (currentHealth == 0) {
        return (person.getName()) + " has died of starvation!";
    }else
        if ((person.getHealth().getCurrent()) < (2 * (getPace().getSpeed()))) {
            return (person.getName()) + " is in danger of starvation.";
        }else {
            return null;
        }
    
}