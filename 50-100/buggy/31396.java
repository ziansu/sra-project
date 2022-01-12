@org.junit.Test
@org.junit.Ignore
public final void retrievesSingleKey() throws java.lang.Exception {
    final com.jcabi.github.PublicKeys keys = this.keys();
    final com.jcabi.github.PublicKey key = keys.create("Title", "Key");
    org.hamcrest.MatcherAssert.assertThat(keys.get(key.number()), org.hamcrest.Matchers.equalTo(key));
    keys.remove(key.number());
}