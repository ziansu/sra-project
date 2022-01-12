@java.lang.Override
public java.util.List<com.notlob.jgrid.examples.Person> getChildren(com.notlob.jgrid.examples.Person person) {
    if ((person.getChildren()) != null) {
        return person.getChildren();
    }
    return super.getChildren(person);
}