@org.junit.Test
public void autoIncrementSchoolId() {
    tab.School school1 = new tab.School("UMKC", "kangaroos");
    tab.School school2 = new tab.School("KU", "jayhawks");
    assertEquals(((school1.getId()) + 1), school2.getId());
}