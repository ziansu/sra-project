@java.lang.Override
public final T getObject() {
    if ((state) == (org.apache.wicket.model.LoadableDetachableModel.InternalState.DETACHED)) {
        state = org.apache.wicket.model.LoadableDetachableModel.InternalState.ATTACHING;
        transientModelObject = load();
        if (org.apache.wicket.model.LoadableDetachableModel.log.isDebugEnabled()) {
            org.apache.wicket.model.LoadableDetachableModel.log.debug(((((("loaded transient object " + (transientModelObject)) + " for ") + (this)) + ", requestCycle ") + (org.apache.wicket.request.cycle.RequestCycle.get())));
        }
        state = org.apache.wicket.model.LoadableDetachableModel.InternalState.ATTACHED;
        onAttach();
    }
    return transientModelObject;
}