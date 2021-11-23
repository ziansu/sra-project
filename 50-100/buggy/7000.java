@java.lang.Override
public int compare(hu.schonherz.training.web.supervisor.accessories.UserResults o1, hu.schonherz.training.web.supervisor.accessories.UserResults o2) {
    return ((o1.getExamSum()) + (o1.getHomeworkSum())) > ((o2.getExamSum()) + (o2.getHomeworkSum())) ? 1 : ((o1.getExamSum()) + (o1.getHomeworkSum())) == ((o2.getExamSum()) + (o2.getHomeworkSum())) ? 0 : -1;
}