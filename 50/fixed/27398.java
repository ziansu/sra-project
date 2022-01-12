@java.lang.Override
public int compare(org.eclipse.debug.core.ILaunchConfigurationType aFirst, org.eclipse.debug.core.ILaunchConfigurationType aSecond) {
    return aFirst.getName().toLowerCase().compareTo(aSecond.getName().toLowerCase());
}