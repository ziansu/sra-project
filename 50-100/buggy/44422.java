@java.lang.Override
public action.Action getNextStep(agent.Human human) {
    if ((human.getAge()) > (context.Constants.maxAge))
        return human.goGetAdulthood();
    
    if ((context.ContextCreator.getPlaceAt(human.getX(), human.getY()).getType()) == (agent.place.PlaceType.SCHOOL))
        return new action.WaitAction(human, context.Constants.schoolDuration);
    
    return new action.GoToPlaceAction(human, agent.place.PlaceType.SCHOOL);
}