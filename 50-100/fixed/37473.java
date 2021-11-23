@org.junit.Before
public void init() {
    this.allConnections = new database.AllConnections();
    oop = new defPackage.MockClassroom("OOP", db.classroomDB.addClassroom("OOP", "1"), "1");
    pp = new defPackage.MockClassroom("Paradigms", db.classroomDB.addClassroom("Paradigms", "1"), "1");
    meth = new defPackage.MockClassroom("Methodologies", db.classroomDB.addClassroom("Methodologies", "1"), "1");
}