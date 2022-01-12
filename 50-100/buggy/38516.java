private Message.MessageStatus convertMessageStatus(com.avos.avoscloud.im.v2.AVIMMessage.AVIMMessageStatus avimMessageStatus) {
    appLogic.Message.MessageStatus status = Message.MessageStatus.SUCCEED;
    switch (avimMessageStatus) {
        case AVIMMessageStatusFailed :
            status = Message.MessageStatus.FAIL;
            break;
        case AVIMMessageStatusSent :
            status = Message.MessageStatus.SUCCEED;
            break;
        case AVIMMessageStatusSending :
            status = Message.MessageStatus.INPROGRESS;
        default :
            status = Message.MessageStatus.SUCCEED;
    }
    return status;
}