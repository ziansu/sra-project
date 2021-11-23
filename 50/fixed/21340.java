@org.junit.Test
public void shouldBindToView() {
    org.assertj.core.api.Assertions.assertThat(presenter.getView().get()).isSameAs(view);
}