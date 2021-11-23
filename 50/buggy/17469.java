public static be.ringring.message.exception.Error findByCode(java.lang.Integer code) {
    for (be.ringring.message.exception.Error error : be.ringring.message.exception.Error.values()) {
        if ((error.code) == code) {
            return error;
        }
    }
    return null;
}