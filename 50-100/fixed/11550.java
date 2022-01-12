@java.lang.Override
public char getGrid(int x, int y) throws java.io.IOException {
    outToServer.writeBytes((((("GRID " + x) + " ") + y) + "\n"));
    java.lang.String response = inFromServer.readLine();
    java.lang.System.out.print((response + " "));
    return response.charAt(0);
}