@java.lang.Override
@co.paralleluniverse.fibers.Suspendable
public final void close(java.lang.Throwable t) {
    co.paralleluniverse.comsat.webactors.netty.WebActorHandler.log.error("Exception while closing HTTP adapter", t);
    actor.die(t);
}