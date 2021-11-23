@java.lang.Override
public void initialCallback(org.continuousassurance.swamp.jenkins.InitialInfo initial) {
    info = initial;
    tool = ((info.getToolName()) + " ") + (info.getToolVersion());
    platform = "?";
    java.lang.System.out.println(("Tool = " + (tool)));
}