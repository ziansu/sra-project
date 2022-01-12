@java.lang.Override
public void exec(final java.net.URI home) throws java.io.IOException {
    org.hamcrest.MatcherAssert.assertThat(new org.takes.rs.RsPrint(new org.takes.tk.TkProxy(home).act(new org.takes.rq.RqFake(method))).print(), org.hamcrest.Matchers.containsString("hello"));
}