@org.junit.Test
public void should_log_when_calculating_with_spy() {
    class SpyLogger implements logger.Logger {
        private java.lang.String message;

        @java.lang.Override
        public void log(java.lang.String message) {
            this.message = message;
        }

        public java.lang.String getMessage() {
            return message;
        }
    }
    SpyLogger spyLogger = new SpyLogger();
    hitchhicker.HitchHikerGuide guide = new hitchhicker.HitchHikerGuide(spyLogger);
    guide.answer();
    org.junit.Assert.assertThat(spyLogger.getMessage(), org.hamcrest.CoreMatchers.is("Calculating the meaning of life, the universe and everything"));
}