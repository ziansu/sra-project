@org.junit.Test
public void testInstantiateWithWrongNumber() {
    thrown.expect(somossuinos.aptcomplex.domain.exception.AptComplexDomainException.class);
    thrown.expectMessage("Invalid document");
    new somossuinos.aptcomplex.domain.person.document.TaxAndCreditDocument(somossuinos.aptcomplex.domain.person.document.TaxAndCreditDocumentTest.WRONG_DOC);
}