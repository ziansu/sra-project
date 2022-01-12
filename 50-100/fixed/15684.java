@java.lang.Override
public void start() {
    addCloseClientConnectionObserver();
    this.gameOver = false;
    java.lang.Thread t = new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            while (!(gameOver)) {
                try {
                    es.ucm.fdi.tp.control.multiplayer.Responses.Response r = ((es.ucm.fdi.tp.control.multiplayer.Responses.Response) (serverConnection.getObject()));
                    for (es.ucm.fdi.tp.basecode.bgame.model.GameObserver o : observers) {
                        r.run(o);
                    }
                } catch (java.lang.ClassNotFoundException | java.io.IOException e) {
                }
            } 
        }
    };
    t.start();
}