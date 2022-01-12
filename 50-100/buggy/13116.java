public int[] getAllThreadIDs() {
    if ((threadIDs) != null) {
        int[] result = new int[threadIDs.size()];
        for (int i = 0; i < (threadIDs.size()); ++i) {
            result[i] = threadIDs.get(i);
            android.util.Log.i(nl.dcc.buffer_bci.bufferservicecontroller.ClientsController.TAG, ("id: " + (result[i])));
        }
        return result;
    }
    return new int[]{  };
}