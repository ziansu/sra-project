@org.junit.Test(expected = domain.exceptions.DomainException.class)
public void HangMan_moet_een_exception_gooien_als_gegeven_woordenlijst_null() {
    new domain.HangMan(geldigeSpeler, null);
}