private K convertKeyIfNecessary(java.lang.Object messageKey) {
    if (messageKey != null) {
        if (getProducerMetadata().getKeyClassType().isAssignableFrom(messageKey.getClass())) {
            return getProducerMetadata().getKeyClassType().cast(messageKey);
        }
        return conversionService.convert(messageKey, producerMetadata.getKeyClassType());
    }else {
        return null;
    }
}