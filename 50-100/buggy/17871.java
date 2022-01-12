public void updateClassroomgroup(gr.ictpro.mall.model.Classroomgroup classroomgroup) {
    if ((classroomgroup.getId()) == 0) {
        classroomgroupService.create(classroomgroup);
    }else {
        gr.ictpro.mall.model.Classroomgroup persistentClassroomgroup = classroomgroupService.retrieveById(classroomgroup.getId());
        persistentClassroomgroup.setName(classroomgroup.getName());
        persistentClassroomgroup.setNotes(classroomgroup.getNotes());
        classroomgroupService.update(persistentClassroomgroup);
    }
}