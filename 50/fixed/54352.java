private java.lang.Object createMessage(api.Service service) {
    switch (service) {
        case SMARTEYE :
            return new actor.msg.CallSmartEye(document);
        default :
        case VELOCITY_CHECK :
            return new actor.msg.CallVelocityCheck(document);
    }
}