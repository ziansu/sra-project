@java.lang.Override
public void configureWith(com.kickstarter.models.Project project) {
    projectImage.onNext(project.photo().med());
    projectName.onNext(project.name());
    projectStats.onNext(new android.support.v4.util.Pair(((int) (project.percentageFunded())), com.kickstarter.libs.utils.ProjectUtils.deadlineCountdownValue(project)));
}