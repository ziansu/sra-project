@org.junit.After
public void cleanUp() throws com.db.edu.chat.server.ServerError, java.io.IOException {
    ser.stop();
    readerClientSocket.close();
}