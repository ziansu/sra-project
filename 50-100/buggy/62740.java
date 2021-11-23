public static void main(java.lang.String[] args) {
    org.elsys.serializer.main.Student student = new org.elsys.serializer.main.Student();
    student.setName("Paisii");
    student.setFatherName("Ivan");
    student.setGrades(java.util.Arrays.asList(2, 5, 6));
    org.elsys.serializer.Serializer serializer = new org.elsys.serializer.json.JsonSerializer();
    serializer.setPretty(true);
    serializer.includeNullFields(true);
    java.lang.String result = serializer.serialize(student);
    java.lang.System.out.println(result);
}