private void sendCommand(java.lang.String button_text, java.lang.String length, java.lang.String up_down) {
    if ((length.length()) > 0) {
        java.lang.String to_send = (((button_text + " ") + length) + " ") + up_down;
        java.lang.System.out.println(to_send);
        output.println(to_send);
        try {
            turtle_coords.setText(input.readLine());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}