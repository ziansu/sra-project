runLowLevel() {
    tokens.take();
    try {
        echo();
    } catch (client.ServerException e) {
        java.lang.System.out.println(e.getMessage());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } finally {
        tokens.release();
    }
}