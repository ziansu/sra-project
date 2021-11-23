@java.lang.Override
@java.lang.SuppressWarnings(value = "HiddenField")
public void initState(com.twitter.heron.api.state.State<java.io.Serializable, java.io.Serializable> state) {
    if (state != null) {
        this.state = state;
        if (!(this.state.containsKey(com.twitter.heron.api.bolt.WindowedBoltExecutor.WINDOWING_INTERNAL_STATE))) {
            this.state.put(com.twitter.heron.api.bolt.WindowedBoltExecutor.WINDOWING_INTERNAL_STATE, new com.twitter.heron.api.state.HashMapState());
        }
    }
}