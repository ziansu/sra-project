@org.junit.Test
public void should_return_student_information() throws java.lang.Exception {
    student = new practice_9.Student("Tom", 21, new java.lang.Class(2));
    assertThat(student.introduce(), org.hamcrest.core.Is.is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
}