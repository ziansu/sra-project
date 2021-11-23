public debrisProcessingSubsystem.operatorComponent.Update pollComponent() {
    if (updateQueue.isEmpty()) {
        return null;
    }else {
        debrisProcessingSubsystem.operatorComponent.Update retUpdate = updateQueue.removeFirst();
        java.lang.System.out.println(retUpdate.getUpdateType());
        return retUpdate;
    }
}