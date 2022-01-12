private final void stopParsing(java.lang.Throwable error) {
    if (error != null) {
        try {
            stopParsing();
        } catch (java.lang.Throwable ex) {
            if (error instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) (error));
            }else
                if (error instanceof java.lang.Error) {
                    throw ((java.lang.Error) (error));
                }else {
                    throw new java.lang.IllegalStateException(error.getMessage(), error);
                }
            
        }
    }
    stopParsing();
}