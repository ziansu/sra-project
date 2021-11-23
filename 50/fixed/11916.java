@org.junit.Test(expected = exception.PackageException.class)
public void testIfCreatesAPackageWithIdNull() throws exception.PackageException {
    newPackage(null, "Pacote 1", 150000);
}