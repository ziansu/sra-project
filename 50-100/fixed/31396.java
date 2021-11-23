@org.junit.Test
public final void retrievesSingleKey() throws java.lang.Exception {
    final com.jcabi.github.PublicKeys keys = this.keys();
    final com.jcabi.github.PublicKey key = keys.create("Title", this.key());
    org.hamcrest.MatcherAssert.assertThat(keys.get(key.number()), org.hamcrest.Matchers.equalTo(key));
    keys.remove(key.number());
}