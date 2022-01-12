@java.lang.Override
public void create(final com.jforex.programming.order.OrderSpecification orderSpecification) {
    lock.lock();
    com.jforex.programming.position.PositionFSM positionFSM = getPositionFSM(orderSpecification.getInstrument());
    java.lang.System.out.println(("State of positionFSM before create: " + positionFSM));
    positionFSM = positionFSM.fireCreate(this, orderSpecification);
    positionFSMs.put(orderSpecification.getInstrument(), positionFSM);
    java.lang.System.out.println(("State of positionFSM after create: " + positionFSM));
    java.lang.System.out.println(("State of saved positionFSM after create: " + (getPositionFSM(orderSpecification.getInstrument()))));
    lock.unlock();
}