@java.lang.Override
public void Log(java.lang.String tag, java.lang.String message, java.lang.String additionalMessage, com.microsoft.aad.adal.Logger.LogLevel level, com.microsoft.aad.adal.ADALError errorCode) {
    for (java.lang.String msg : msgs) {
        if ((message.contains(msg)) || (additionalMessage.contains(msg))) {
            response.tag = tag;
            response.message = message;
            response.additionalMessage = additionalMessage;
            response.level = level;
            response.errorCode = errorCode;
        }else {
            break;
        }
    }
}