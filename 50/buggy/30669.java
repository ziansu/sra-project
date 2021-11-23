public static java.lang.Class getMessageTypeByExtend(byte value) {
    switch (value & (com.zhizus.forest.common.MessageType.RESPONSE_MESSAGE_TYPE)) {
        case 0 :
            return com.zhizus.forest.common.codec.Request.class;
        case 1 :
            return com.zhizus.forest.common.codec.Response.class;
        default :
            return com.zhizus.forest.common.codec.Request.class;
    }
}