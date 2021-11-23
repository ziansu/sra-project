public static int toClientsBufferLengthOffset(final int baseOffset) {
    return baseOffset + (io.aeron.CncFileDescriptor.TO_CLIENTS_BUFFER_LENGTH_FIELD_OFFSET);
}