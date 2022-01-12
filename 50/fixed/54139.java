@java.lang.Override
public void perform(au.com.rayh.Run<?, ?> build, au.com.rayh.FilePath filePath, au.com.rayh.Launcher launcher, au.com.rayh.TaskListener listener) throws java.io.IOException, java.lang.InterruptedException {
    this.result = _perform(build, filePath, launcher, build.getEnvironment(listener), listener);
}