public void sendMessage(int i) {
    try {
        pl.pawc.arduino.shared.Message message = new pl.pawc.arduino.shared.Message(i);
        objectOut.writeObject(message);
        objectOut.flush();
        java.lang.System.out.println("Message has been sent");
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return ;
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
        return ;
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
        return ;
    }
}