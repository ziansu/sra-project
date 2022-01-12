@org.junit.Before
public void setUp() throws java.lang.Exception {
    expPath = java.nio.file.Files.createTempDirectory("ExperimentClass");
    exp = new tw.edu.ncu.CJ102.CoreProcess.Experiment(expPath.toString());
    user = new tw.edu.ncu.CJ102.CoreProcess.MemoryBasedUserProfile();
    exp.setUser(user);
    exp.maper = new tw.edu.ncu.CJ102.CoreProcess.TopicMappingTool(new tw.edu.ncu.CJ102.algorithm.impl.NgdReverseTfTopicSimilarity(), 0.1);
    exp.setExperimentDays(14);
}