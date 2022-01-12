@java.lang.Override
public void set(us.ihmc.commonWalkingControlModules.controllerAPI.input.command.FootstepDataListControllerCommand other) {
    swingTime = other.swingTime;
    transferTime = other.transferTime;
    us.ihmc.robotics.lists.RecyclingArrayList<us.ihmc.commonWalkingControlModules.controllerAPI.input.command.FootstepDataControllerCommand> otherFootsteps = other.getFootsteps();
    clear();
    if (otherFootsteps != null) {
        for (int i = 0; i < (otherFootsteps.size()); i++)
            footsteps.add().set(otherFootsteps.get(i));
        
    }
}