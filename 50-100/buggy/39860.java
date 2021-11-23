private void write(java.lang.String message) throws java.io.IOException {
    message = message.replaceAll("\n", "");
    try {
        writer.write(message);
        writer.newLine();
        writer.flush();
    } catch (java.io.IOException e) {
        logger.warning(("IOException when writing to Socket: " + (e.getMessage())));
        throw e;
    }
}