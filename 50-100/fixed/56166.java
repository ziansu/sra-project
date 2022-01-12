@org.junit.Test
public final void retrievesKeys() throws java.lang.Exception {
    final com.jcabi.github.PublicKeys keys = this.keys();
    final com.jcabi.github.PublicKey key = keys.create("key", this.key());
    org.hamcrest.MatcherAssert.assertThat(keys.iterate(), org.hamcrest.Matchers.hasItem(key));
    keys.remove(key.number());
}