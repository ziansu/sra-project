@org.junit.Test
public void ensureConfigurationIsValid() {
    for (java.lang.String token : java.util.Arrays.asList(MailConfig.FROM, MailConfig.PASSWORD, MailConfig.SMTP_HOST, MailConfig.TO, MailConfig.USERNAME)) {
        org.assertj.core.api.Assertions.assertThat(token).isNotNull();
    }
    org.assertj.core.api.Assertions.assertThat(MailConfig.SMTP_PORT).isEqualTo(465);
}