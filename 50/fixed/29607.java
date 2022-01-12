@org.junit.After
public final void tearDownSessionsResourceTest() {
    accountFactory.destroy(ch.protonmail.vladyslavbond.eurobug.utils.NumericIdentificator.<ch.protonmail.vladyslavbond.eurobug.domain.Account>valueOf(12367864038L));
}