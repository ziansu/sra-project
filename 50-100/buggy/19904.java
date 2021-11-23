@org.junit.Test
public void testMockerVerify() {
    mocker.Mocker.mocker(java.util.List.class).verify(new mocker.Action1<java.util.List>() {
        @java.lang.Override
        public void call(java.util.List list) {
            list.size();
        }
    }).mock().size();
    org.assertj.core.api.Assertions.assertThat(true).isTrue();
}