@java.lang.Override
public synchronized void shutdown(@javax.validation.constraints.NotNull
final java.lang.String name) {
    com.google.common.base.Preconditions.checkArgument(org.apache.commons.lang3.StringUtils.isNotBlank(name));
    if (threadIdToCapMap.containsKey(name)) {
        if (!(au.com.agic.apptesting.utils.impl.LocalThreadWebDriverMapImpl.WEB_DRIVER_FACTORY.leaveWindowsOpen())) {
            if (threadIdToDriverMap.containsKey(name)) {
                threadIdToDriverMap.get(name).quit();
            }
        }
        this.clearWebDriverForThread(name);
    }
}