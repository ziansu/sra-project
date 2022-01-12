private BankMessage buildMessage(int opcode) {
    int[] parameters = new int[1];
    return new BankMessage(PROTOCOL_VERSION, opcode, 404, parameters);
}