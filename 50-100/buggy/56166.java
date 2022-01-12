@org.junit.Test
@org.junit.Ignore
public final void retrievesKeys() throws java.lang.Exception {
    final com.jcabi.github.PublicKeys keys = this.keys();
    final com.jcabi.github.PublicKey key = keys.create("key", "ssh 1AA");
    org.hamcrest.MatcherAssert.assertThat(keys.iterate(), org.hamcrest.Matchers.hasItem(key));
    keys.remove(key.number());
}