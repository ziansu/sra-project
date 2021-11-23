@org.junit.Test
public void autoIncrementSchoolId() {
    tab.School school1 = new tab.School("UMKC", "kangaroos");
    tab.School school2 = new tab.School("KU", "jayhawks");
    assertEquals(1, school1.getId());
    assertEquals(2, school2.getId());
}