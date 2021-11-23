@java.lang.Override
public void run() {
    if ((bufferedReader) != null) {
        while (true) {
            try {
                java.lang.String line = bufferedReader.readLine();
                android.util.Log.d(Consts.TAG, (line == null ? "line = null" : line));
                if ((line != null) && ((mListener) != null)) {
                    mListener.onMessageReceived(line);
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e(Consts.TAG, e.getMessage());
            }
        } 
    }
}