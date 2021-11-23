@java.lang.Override
public java.lang.Boolean apply() {
    final examples.behavior.world.Orientation oldAgentOrientation = env.agentOrientation;
    switch (oldAgentOrientation) {
        case NORTH :
            env.agentOrientation = examples.behavior.world.Orientation.WEST;
            break;
        case EAST :
            env.agentOrientation = examples.behavior.world.Orientation.NORTH;
            break;
        case SOUTH :
            env.agentOrientation = examples.behavior.world.Orientation.EAST;
            break;
        case WEST :
            env.agentOrientation = examples.behavior.world.Orientation.SOUTH;
            break;
    }
    return true;
}