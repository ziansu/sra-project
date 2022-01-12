@org.junit.Test
public void registerLibrary() {
    Library lib = new LibraryImpl("Birkbeck");
    u.register(lib);
    assertEquals(u.getLibrary(), "Birkbeck");
    assertEquals(u.getId(), 0);
    r.register(lib);
    assertEquals(r.getLibrary(), "Birkbeck");
    assertEquals(r.getId(), 1);
}