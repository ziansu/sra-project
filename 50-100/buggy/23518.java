private V convertPayloadIfNecessary(java.lang.Object messagePayload) {
    if (messagePayload != null) {
        if (getProducerMetadata().getKeyClassType().isAssignableFrom(messagePayload.getClass())) {
            return getProducerMetadata().getValueClassType().cast(messagePayload);
        }
        return conversionService.convert(messagePayload, producerMetadata.getValueClassType());
    }else {
        return null;
    }
}