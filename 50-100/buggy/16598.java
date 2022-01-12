@org.junit.Test
@org.junit.Ignore
public final void removesKey() throws java.lang.Exception {
    final com.jcabi.github.PublicKeys keys = this.keys();
    final com.jcabi.github.PublicKey key = keys.create("", "");
    org.hamcrest.MatcherAssert.assertThat(keys.iterate(), org.hamcrest.Matchers.hasItem(key));
    keys.remove(key.number());
    org.hamcrest.MatcherAssert.assertThat(keys.iterate(), org.hamcrest.Matchers.not(org.hamcrest.Matchers.hasItem(key)));
}