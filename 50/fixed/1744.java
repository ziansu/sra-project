public void addStudentToSmallestSection(defPackage.Person p) {
    defPackage.Section section = db.sectionDB.getSmallestSection(this.classroomID);
    if (section == null) {
        return ;
    }
    section.addStudentToSection(p.getEmail());
}