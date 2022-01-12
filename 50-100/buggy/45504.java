@java.lang.Override
public void onTimeout(final net.named_data.jndn.Interest interest) {
    (state.nRetries)--;
    if ((state.nRetries) > 0) {
        try {
            face.expressInterest(new net.named_data.jndn.Interest(interest).setNonce(null), this, this);
        } catch (java.io.IOException e) {
            com.intel.jndn.management.helpers.FetchHelper.LOG.log(java.util.logging.Level.INFO, ("Error while expressing interest: " + (e.toString())), e);
        }
    }else {
        state.isDone = true;
    }
}