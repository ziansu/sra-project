@java.lang.Override
public com.jforex.programming.position.PositionState fireEventFullFill(final com.jforex.programming.position.IPositionFSMContext context, final com.dukascopy.api.IOrder order) {
    final com.dukascopy.api.Instrument instrument = order.getInstrument();
    if (context.fsmIsSLTPSet(instrument)) {
        context.fsmDoRemoveSLTP(instrument);
        return com.jforex.programming.position.PositionState.REMOVE_SLTP;
    }else {
        context.fsmDoMerge(instrument);
        return com.jforex.programming.position.PositionState.MERGING;
    }
}