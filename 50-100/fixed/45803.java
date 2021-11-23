@java.lang.Override
public void run() {
    isClientRunning = true;
    while (isClientRunning) {
        try {
            newMessage = ((newspeak.network.NewspeakMessage) (reader.readObject()));
        } catch (java.io.IOException e) {
        } catch (java.lang.ClassNotFoundException e) {
            messages.offer("[ERROR] Could not find requested class of NewspeakMessage.class when reading message\n");
            break;
        }
        isClientRunning = processMessage(newMessage);
    } 
    remove(id);
    close();
}