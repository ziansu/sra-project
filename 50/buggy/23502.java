private BankMessage buildMessage(int opcode) {
    int[] parameters = null;
    return new BankMessage(PROTOCOL_VERSION, opcode, 404, parameters);
}