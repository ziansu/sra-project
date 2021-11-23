@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.virtualightning.library.simple2develop.state.MainLoopCall.MSG_STATE_UPDATE :
            java.lang.Object[] objects = ((java.lang.Object[]) (msg.obj));
            com.virtualightning.library.simple2develop.state.StateMediator mediator = ((com.virtualightning.library.simple2develop.state.StateMediator) (objects[0]));
            msg.obj = null;
            if ((msg.arg1) == (mediator.getSequenceId()))
                mediator.updateObserver(((java.lang.Object[]) (objects[1])));
            
            break;
    }
}