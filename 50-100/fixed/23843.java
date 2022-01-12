@org.junit.Test
public void changePathname_withSeparator() throws java.lang.Exception {
    xyz.enhorse.commons.HandyPath original = new xyz.enhorse.commons.HandyPath(existingFile());
    java.lang.String newPathname = (existingDirectory()) + "new";
    assertEquals(newPathname, original.changePathname((newPathname + (HandyPath.PATH_SEPARATOR))).pathname());
}