@java.lang.Override
public java.lang.Boolean apply() {
    final examples.behavior.world.Orientation oldAgentOrientation = env.agentOrientation;
    switch (oldAgentOrientation) {
        case NORTH :
            env.agentOrientation = examples.behavior.world.Orientation.WEST;
        case EAST :
            env.agentOrientation = examples.behavior.world.Orientation.NORTH;
        case SOUTH :
            env.agentOrientation = examples.behavior.world.Orientation.EAST;
        case WEST :
            env.agentOrientation = examples.behavior.world.Orientation.SOUTH;
    }
    return true;
}