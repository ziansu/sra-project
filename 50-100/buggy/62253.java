@java.lang.Override
@java.lang.SuppressWarnings(value = { "unchecked" , "HiddenField" })
public void initState(com.twitter.heron.api.state.State<java.io.Serializable, java.io.Serializable> state) {
    this.state = state;
    if (!(this.state.containsKey(com.twitter.heron.api.bolt.WindowedBoltExecutor.WINDOWING_INTERNAL_STATE))) {
        this.state.put(com.twitter.heron.api.bolt.WindowedBoltExecutor.WINDOWING_INTERNAL_STATE, new com.twitter.heron.api.state.HashMapState<java.io.Serializable, java.io.Serializable>());
    }else {
        this.windowingInternalState = ((java.util.Map<java.lang.String, java.io.Serializable>) (state.get(com.twitter.heron.api.bolt.WindowedBoltExecutor.WINDOWING_INTERNAL_STATE)));
    }
}