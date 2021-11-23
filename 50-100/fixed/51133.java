@java.lang.Override
public void Act(Field field, java.util.ArrayList<Actor> newActors) {
    int age = IncrementAge();
    if (age == (ModelConstants.Weed_Maximum_Age)) {
        setDead(true);
    }else
        if (thresholdAgeReached()) {
            spread(field, newActors);
        }
    
}