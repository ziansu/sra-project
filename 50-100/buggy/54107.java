private datamanagement.IStudent createStudent(java.lang.Integer id) {
    datamanagement.IStudent student;
    datamanagement.Element el = getStudentElement(id);
    if (el != null) {
        datamanagement.StudentUnitRecordList recordList = datamanagement.StudentUnitRecordManager.instance().getRecordsByStudent(id);
        student = new datamanagement.Student(new java.lang.Integer(el.getAttributeValue("sid")), el.getAttributeValue("fname"), el.getAttributeValue("lname"), recordList);
        studentMap.put(student.getID(), student);
        return student;
    }
    throw new java.lang.RuntimeException("DBMD: createStudent : student not in file");
}