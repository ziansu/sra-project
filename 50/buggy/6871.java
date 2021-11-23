public static com.v3ld1n.Message get(java.lang.String name) {
    for (com.v3ld1n.Message message : com.v3ld1n.V3LD1N.getMessages()) {
        if (message.getName().equalsIgnoreCase(name)) {
            return message;
        }
    }
    return null;
}