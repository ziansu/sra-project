@java.lang.Override
public void run() {
    try {
        models.AgentCenter ac = new models.AgentCenter(getHostName(), getCurrentAddress());
        helper.CenterInfo.setAgentCenter(ac);
        setTypes();
        if (!(helper.CenterInfo.getMasterAddress().equals(getCurrentAddress()))) {
            CenterInfo.MASTER = false;
        }else {
            CenterInfo.MASTER = true;
        }
        data.Data.addAgentCenter(ac);
    } catch (javax.management.InstanceNotFoundException | javax.management.AttributeNotFoundException | javax.management.MalformedObjectNameException | javax.management.ReflectionException | javax.management.MBeanException e) {
        e.printStackTrace();
    }
}