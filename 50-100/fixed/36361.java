@java.lang.Override
public void run() {
    while (isListening) {
        try {
            try {
                longPoll(this.options, isListening);
            } catch (io.spire.request.ResponseException e) {
                java.lang.System.out.println(e.getMessage());
                e.getResponse().ignore();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            stopListening();
        }
    } 
}