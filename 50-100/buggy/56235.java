public void enoceanTelegram(long senderId, esp3.message.TelegramData telegram) {
    enocean.OceanConn.LOGGER.debug(("got telegram from " + (java.lang.Long.toString(senderId, 16))));
    for (enocean.OceanDevice dev : devices) {
        if (((dev.node.getAttribute("sender id")) != null) && (senderId == (dev.node.getAttribute("sender id").getNumber().longValue()))) {
            dev.telegram(telegram);
        }
    }
}