@java.lang.Override
public void detachActor(com.ourpalm.hot.aactor.ActorRef ref) {
    if (ref == null) {
        return ;
    }
    config.getDispatcher().detachActor(ref);
}