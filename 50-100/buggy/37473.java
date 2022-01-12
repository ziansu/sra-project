@org.junit.Before
public void bla(database.AllConnections allConnections) {
    this.allConnections = allConnections;
    oop = new defPackage.MockClassroom("OOP", db.classroomDB.addClassroom("OOP", "1"), "1");
    pp = new defPackage.MockClassroom("Paradigms", db.classroomDB.addClassroom("Paradigms", "1"), "1");
    meth = new defPackage.MockClassroom("Methodologies", db.classroomDB.addClassroom("Methodologies", "1"), "1");
}