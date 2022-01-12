@java.lang.Override
public synchronized void stop() {
    try {
        this.gameOver = true;
        super.stop();
    } catch (es.ucm.fdi.tp.basecode.bgame.model.GameError e) {
        view.log(e.getMessage());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        for (es.ucm.fdi.tp.control.multiplayer.Connection c : clients) {
            try {
                c.stop();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
        this.stop();
    }
    view.onServerClosed();
}