@java.lang.Override
public void deletePerson(java.lang.Long id) {
    introsde.document.model.Measure.deleteMeasure(id, new introsde.document.model.Measure());
    introsde.document.model.Person.deletePerson(id);
}