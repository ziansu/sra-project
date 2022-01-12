@java.lang.Override
public void create(final com.jforex.programming.order.OrderSpecification orderSpecification) {
    lock.lock();
    com.jforex.programming.position.PositionFSM positionFSM = getPositionFSM(orderSpecification.getInstrument());
    positionFSM = positionFSM.fireCreate(this, orderSpecification);
    positionFSMs.put(orderSpecification.getInstrument(), positionFSM);
    lock.unlock();
}