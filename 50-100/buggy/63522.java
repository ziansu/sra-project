@java.lang.Override
public void run() {
    if (!(address.equals(Person.me.ip))) {
        try {
            byte[] sendData = data.getBytes();
            java.net.DatagramPacket sendPacket = new java.net.DatagramPacket(sendData, sendData.length, address, 20091);
            com.notify.hellmannlukas.notify.Toustovac.getInstance().toust(("Sending to " + (address.toString())));
            SendSocket.send(sendPacket);
        } catch (java.io.IOException e) {
            android.util.Log.d(TAG, e.getMessage());
        }
    }
}