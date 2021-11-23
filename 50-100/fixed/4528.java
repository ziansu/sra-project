@org.junit.Test
public void testGetAllStudent() {
    java.lang.Iterable<com.jimmy.domain.Student> list = studentRepository.findAll();
    java.util.Iterator<com.jimmy.domain.Student> itr = list.iterator();
    while (itr.hasNext()) {
        java.lang.System.out.println(("id:" + (itr.next().getId())));
    } 
}