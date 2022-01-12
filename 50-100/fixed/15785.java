private void readPayLoad(int length) throws java.io.IOException {
    for (int i = 0; i < length; i++)
        response.SetContent(((byte) (ReadByte())));
    
    response.SetCheckSum(ReadByte());
}