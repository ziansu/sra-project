public java.lang.String prepareResponse(com.medziku.motoresponder.logic.RespondingSubject subject) {
    if (subject instanceof com.medziku.motoresponder.logic.SMSRespondingSubject) {
        if ((subject instanceof com.medziku.motoresponder.logic.GeolocationRequestRespondingSubject) && (this.shouldRespondWithGeolocation())) {
            return this.getAutoResponseMessageWithGeolocation();
        }
        return this.settings.getAutoResponseToSmsTemplate();
    }else
        if (subject instanceof com.medziku.motoresponder.logic.CallRespondingSubject) {
            return this.settings.getAutoResponseToCallTemplate();
        }
    
}