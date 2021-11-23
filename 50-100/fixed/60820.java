private org.olat.course.nodes.CourseNode createCourseNode(org.olat.core.util.vfs.VFSItem item, java.lang.String type) {
    org.olat.course.nodes.CourseNodeConfiguration newNodeConfig = org.olat.course.nodes.CourseNodeFactory.getInstance().getCourseNodeConfiguration(type);
    org.olat.course.nodes.CourseNode newNode = newNodeConfig.getInstance();
    newNode.setShortTitle(item.getName());
    newNode.setLearningObjectives(item.getName());
    newNode.setNoAccessExplanation("You don't have access");
    return newNode;
}