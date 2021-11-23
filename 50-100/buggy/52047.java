public void setStabilization(boolean flag) {
    byte device = 2;
    byte command = 3;
    int flag_data = 0;
    if (flag)
        flag_data = 1;
    
    byte[] data = new byte[]{ ((byte) (flag_data)) };
    byte[] packet = buildCommand(device, command, data, false);
    comm.write(packet);
}