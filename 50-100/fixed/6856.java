@org.junit.jupiter.api.Test
void shouldInjectCustomInstanceAsParameter(io.specto.hoverfly.junit.core.Hoverfly hoverfly) {
    io.specto.hoverfly.junit5.HoverflyCustomCaptureTest.hoverflyInstance = hoverfly;
    org.assertj.core.api.Assertions.assertThat(hoverfly.getMode()).isEqualTo(HoverflyMode.CAPTURE);
    org.assertj.core.api.Assertions.assertThat(hoverfly.getHoverflyInfo().getModeArguments().getHeadersWhitelist()).containsExactly("*");
}